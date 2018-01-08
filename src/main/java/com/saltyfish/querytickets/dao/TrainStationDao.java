package com.saltyfish.querytickets.dao;

import com.saltyfish.querytickets.model.TrainStationEntity;

import java.util.List;

/**
 * TrainStation Dao方法
 *
 * @author 颜贤锋
 */
public interface TrainStationDao {

    /**
     * 获取所有站点信息
     *
     * @return
     */
    List<TrainStationEntity> getAll();

    /**
     * 增加站点信息
     *
     * @param trainStationEntity
     */
    void add(TrainStationEntity trainStationEntity);

    /**
     * 删除站点
     *
     * @param id
     */
    void delete(Integer id);

    /**
     * 修改站点信息
     *
     * @param trainStationEntity
     */
    void update(TrainStationEntity trainStationEntity);

    /**
     * 通过站点名获取站点信息
     *
     * @param name
     * @return
     */
    TrainStationEntity getByName(String name);
}
