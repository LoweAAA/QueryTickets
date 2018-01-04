package com.saltyfish.querytickets.dao;

import com.saltyfish.querytickets.model.TrainEntity;

import java.util.List;

/**
 * 火车的Dao
 *
 * @author zjh514514
 */
public interface TrainDao {

    /**
     * 增加火车
     *
     * @param trainEntity
     */
    void add(TrainEntity trainEntity);

    /**
     * 删除火车
     *
     * @param id
     */
    void delete(Integer id);

    /**
     * 修改火车信息
     *
     * @param trainEntity
     */
    void update(TrainEntity trainEntity);

    /**
     * 查询火车余票信息
     *
     * @return
     */
    List getall();
}
