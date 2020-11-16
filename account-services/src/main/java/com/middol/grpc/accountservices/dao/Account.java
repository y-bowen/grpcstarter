package com.middol.grpc.accountservices.dao;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Account {
    private Integer id;

    private String userId;

    private BigDecimal money;

}
