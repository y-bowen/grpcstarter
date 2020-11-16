package com.middol.grpc.storageservice.services;

import com.middol.grpc.StorageReply;
import com.middol.grpc.StorageRequest;
import com.middol.grpc.StorageServiceGrpc;
import com.middol.grpc.storageservice.dao.Storage;
import com.middol.grpc.storageservice.dao.StorageMapper;
import io.grpc.stub.StreamObserver;
import io.seata.spring.annotation.GlobalLock;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author <a href="http://gitlab.middol.cn:81/bowen">bowen yang</a>
 * @version 1.0
 * @date 2020年11月16日 9:48 上午
 */
@Slf4j
@GrpcService
public class StorageServiceImpl extends StorageServiceGrpc.StorageServiceImplBase {
    @Autowired
    private StorageMapper storageMapper;
    @Autowired
    private DataSource dataSource;

    @Override
    @GlobalTransactional
    public void deduct(StorageRequest storageRequest, StreamObserver<StorageReply> streamObserver) {
        //There is a latent isolation problem here.
        //I hope that users can solve it and deepen their understanding of seata isolation.
        //At the bottom I will put a reference solution.
        Storage storage = storageMapper.findByCommodityCode(storageRequest.getCommodityCode());
        storage.setCount(storage.getCount() - storageRequest.getCount());
        storageMapper.updateById(storage);
        streamObserver.onNext(StorageReply.newBuilder().setMessage("success").build());
        streamObserver.onCompleted();
    }

    @GlobalLock
    @Override
    public void get(StorageRequest storageRequest, StreamObserver<StorageRequest> streamObserver) {
        Storage storage = storageMapper.selectById(storageRequest.getId());
        StorageRequest request = StorageRequest.newBuilder()
                .setCount(storage.getCount())
                .setCommodityCode(storage.getCommodityCode())
                .setId(storage.getId())
                .build();
        streamObserver.onNext(request);
        streamObserver.onCompleted();
    }

    /**
     * 0.8.0 release
     *
     */
    @SneakyThrows
    @GlobalTransactional
    @Override
    public void batchUpdate(StorageRequest storageRequest, StreamObserver<StorageRequest> streamObserver) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = dataSource.getConnection();
            connection.setAutoCommit(false);
            String sql = "update storage_tbl set count = ?" +
                    "    where id = ? and commodity_code = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 100);
            preparedStatement.setLong(2, 1);
            preparedStatement.setString(3, "2001");
            preparedStatement.addBatch();
            preparedStatement.setInt(1, 200);
            preparedStatement.setLong(2, 2);
            preparedStatement.setString(3, "2002");
            preparedStatement.addBatch();
            preparedStatement.setInt(1, 300);
            preparedStatement.setLong(2, 3);
            preparedStatement.setString(3, "2003");
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
            connection.commit();
            System.out.println(1 / 0);
        } finally {
            connection.close();
            preparedStatement.close();
        }
    }

    /**
     * 0.8.0 release
     *
     */
    @SneakyThrows
    @GlobalTransactional
    @Override
    public void batchDelete(StorageRequest storageRequest, StreamObserver<StorageRequest> streamObserver) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = dataSource.getConnection();
            connection.setAutoCommit(false);
            String sql = "delete from storage_tbl where  count = ? and commodity_code = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 11);
            preparedStatement.setString(2, "2001");
            preparedStatement.addBatch();
            preparedStatement.setInt(1, 22);
            preparedStatement.setString(2, "2002");
            preparedStatement.addBatch();
            preparedStatement.setInt(1, 33);
            preparedStatement.setString(2, "2003");
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
            connection.commit();
            System.out.println(1 / 0);
        } finally {
            connection.close();
            preparedStatement.close();
        }
    }
}
