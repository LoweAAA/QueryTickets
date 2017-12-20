package com.saltyfish.querytickets.dao;

import com.saltyfish.querytickets.model.TrainEntity;

import java.util.List;

public interface TrainPassByStationsDao {

    List getAll(TrainEntity train);
}
