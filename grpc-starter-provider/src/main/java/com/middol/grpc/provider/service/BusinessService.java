package com.middol.grpc.provider.service;

import com.middol.grpc.OrderRequest;
import com.middol.grpc.OrderServiceGrpc;
import com.middol.grpc.StorageRequest;
import com.middol.grpc.StorageServiceGrpc;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

/**
 * @author <a href="http://gitlab.middol.cn:81/bowen">bowen yang</a>
 * @version 1.0
 * @date 2020年11月16日 10:29 上午
 */
@Slf4j
@Service
public class BusinessService {
    @GrpcClient("storage")
    private StorageServiceGrpc.StorageServiceBlockingStub storageServiceStub;

    @GrpcClient("order")
    private OrderServiceGrpc.OrderServiceBlockingStub orderServiceStub;
    /**
     * 减库存，下订单
     *
     * @param userId
     * @param commodityCode
     * @param orderCount
     */
    @GlobalTransactional
    public void purchase(String userId, String commodityCode, int orderCount) {
        log.info("purchase begin ... xid: " + RootContext.getXID());
        StorageRequest storageRequest = StorageRequest.newBuilder()
                .setCommodityCode(commodityCode)
                .setCount(orderCount)
                .build();
        storageServiceStub.deduct(storageRequest);
        OrderRequest orderRequest = OrderRequest.newBuilder()
                .setCount(orderCount)
                .setCommodityCode(commodityCode)
                .setUserId(userId)
                .build();
        orderServiceStub.create(orderRequest);
        System.out.println("Aaaa");
    }
}
