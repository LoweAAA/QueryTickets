package com.saltyfish.querytickets.service;

import com.saltyfish.querytickets.model.TrainStationEntity;

import java.util.List;

public interface TrainStationService {

    public List<TrainStationEntity> getAll();

    public void add(TrainStationEntity trainStationEntity);

    public void delete(Integer id);

    public void update(TrainStationEntity trainStationEntity);
}
