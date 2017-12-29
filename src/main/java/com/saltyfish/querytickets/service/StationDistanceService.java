package com.saltyfish.querytickets.service;

import com.saltyfish.querytickets.model.TrainStationDistanceEntity;

import java.util.List;

public interface StationDistanceService {
    public List getAll();

    public void add(double distance,String start,String end);

    public void delete(Integer id);

    public void update(Integer id, Double distance);
}
