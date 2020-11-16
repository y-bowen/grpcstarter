package com.middol.grpc.storageservice.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author <a href="http://gitlab.middol.cn:81/bowen">bowen yang</a>
 * @version 1.0
 * @date 2020年11月16日 9:43 上午
 */
@Mapper
public interface StorageMapper {
    Storage selectById(@Param("id") Integer id);

    Storage findByCommodityCode(@Param("commodityCode") String commodityCode);

    int updateById(Storage record);

    void insert(Storage record);

    void insertBatch(List<Storage> records);

    int updateBatch(@Param("list") List<Long> ids, @Param("commodityCode") String commodityCode);
}
