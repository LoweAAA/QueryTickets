package com.saltyfish.querytickets.dao;

import com.saltyfish.querytickets.model.TrainStationEntity;

import java.util.List;

/**
 * TrainStation Dao方法
 *
 * @author zjh514514
 */
public interface TrainStationDao {

    public List<TrainStationEntity> getAll();
}
