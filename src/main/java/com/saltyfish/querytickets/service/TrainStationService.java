package com.saltyfish.querytickets.service;

import com.saltyfish.querytickets.model.TrainStationEntity;

import java.util.List;

public interface TrainStationService {

    /**
     * 获取所有站点信息
     *
     * @return
     */
    public List<TrainStationEntity> getAll();

    /**
     * 增加站点信息
     *
     * @param trainStationEntity
     */
    public void add(TrainStationEntity trainStationEntity);

    /**
     * 删除站点信息
     *
     * @param id
     */
    public void delete(Integer id);

    /**
     * 修改站点信息
     *
     * @param trainStationEntity
     */
    public void update(TrainStationEntity trainStationEntity);
}
