package com.saltyfish.querytickets.dao;

import com.saltyfish.querytickets.model.TrainStationEntity;

import java.util.List;

public interface TrainStationDistanceDao {

    /**
     * 获取所有站点距离
     *
     * @return
     */
    List getAll();

    /**
     * 增加两个站点之间距离
     *
     * @param trainStationStart
     * @param trainStationEnd
     */
    void add(TrainStationEntity trainStationEntity);

    /**
     * 删除两个站点之间距离
     *
     * @param id
     */
    void delete(Integer id);

    /**
     * 修改两个站点之间距离
     *
     * @param id
     * @param distance
     */
    void update(Integer id, Double distance);
}
