package com.middol.grpc.accountservices.services;

import com.middol.grpc.Account;
import com.middol.grpc.AccountReply;
import com.middol.grpc.AccountServiceGrpc;
import com.middol.grpc.accountservices.dao.AccountMapper;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * @author <a href="http://gitlab.middol.cn:81/bowen">bowen yang</a>
 * @version 1.0
 * @date 2020年11月10日 5:22 下午
 */
@Slf4j
@GrpcService
public class AccountServiceImpl extends AccountServiceGrpc.AccountServiceImplBase {

    private static final String ERROR_USER_ID = "1002";

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void debit(Account request, StreamObserver<AccountReply> responseObserver) {
        com.middol.grpc.accountservices.dao.Account account = accountMapper.selectByUserId(request.getUserId());
        account.setMoney(account.getMoney().subtract(BigDecimal.valueOf(request.getNum())));
        accountMapper.updateById(account);

        if (ERROR_USER_ID.equals(request.getUserId())) {
            responseObserver.onError(new RuntimeException("account branch exception"));
        }else {
            responseObserver.onNext(AccountReply.newBuilder().setMessage("success").build());
        }
        responseObserver.onCompleted();
    }
}
