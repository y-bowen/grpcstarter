package com.middol.grpc.orderservice.serveice;

import com.middol.grpc.*;
import com.middol.grpc.orderservice.dao.OrderMapper;
import com.middol.grpc.orderservice.dao.Order;
import io.grpc.stub.StreamObserver;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * @author <a href="http://gitlab.middol.cn:81/bowen">bowen yang</a>
 * @version 1.0
 * @date 2020年11月10日 5:50 下午
 */
@Slf4j
@GrpcService
public class OrderServiceImpl extends OrderServiceGrpc.OrderServiceImplBase {

    @Autowired
    private OrderMapper orderMapper;

    @GrpcClient("account")
    private AccountServiceGrpc.AccountServiceBlockingStub accountServiceStub;
    
    @Override
    @GlobalTransactional
    public void create(OrderRequest request, StreamObserver<OrderReply> responseObserver) {
        BigDecimal orderMoney = new BigDecimal(request.getCount()).multiply(new BigDecimal(5));
        Order order = new Order();
        order.setUserId(request.getUserId());
        order.setCommodityCode(request.getCommodityCode());
        order.setCount(request.getCount());
        order.setMoney(orderMoney);

        orderMapper.insert(order);
        Account account = Account.newBuilder().setUserId(request.getUserId()).setNum(orderMoney.doubleValue()).build();
        accountServiceStub.debit(account);
        responseObserver.onNext(OrderReply.newBuilder().setMessage("success").build());
        responseObserver.onCompleted();
    }
}
