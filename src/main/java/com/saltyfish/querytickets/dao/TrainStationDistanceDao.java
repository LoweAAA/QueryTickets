package com.saltyfish.querytickets.dao;

import com.saltyfish.querytickets.model.TrainStationDistanceEntity;
import com.saltyfish.querytickets.model.TrainStationEntity;

import java.util.List;

/**
 * 管理车站距离
 *
 * @author 颜贤锋
 */
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
     * @param trainStationEnd
     */
    void add(TrainStationDistanceEntity trainStationDistanceEntity);

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
