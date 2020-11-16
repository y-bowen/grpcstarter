package com.middol.grpc.orderservice.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    int insert(Order record);

}

