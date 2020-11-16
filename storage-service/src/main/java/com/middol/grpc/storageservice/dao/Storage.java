package com.middol.grpc.storageservice.dao;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author <a href="http://gitlab.middol.cn:81/bowen">bowen yang</a>
 * @version 1.0
 * @date 2020年11月16日 9:42 上午
 */
@Slf4j
@Data
public class Storage {
    private Integer id;

    private String commodityCode;

    private Integer count;
}
