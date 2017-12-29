package com.saltyfish.querytickets.service.serviceimpl;

import com.saltyfish.querytickets.dao.TrainStationDao;
import com.saltyfish.querytickets.dao.TrainStationDistanceDao;
import com.saltyfish.querytickets.model.TrainStationDistanceEntity;
import com.saltyfish.querytickets.model.TrainStationEntity;
import com.saltyfish.querytickets.service.StationDistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StationDistanceServiceImpl implements StationDistanceService{

    @Autowired
    private TrainStationDistanceDao trainStationDistanceDao;

    @Autowired
    private TrainStationDao trainStationDao;

    @Override
    public List getAll() {
        return trainStationDistanceDao.getAll();
    }

    @Override
    public void add(double distance,String start,String end) {
        TrainStationDistanceEntity trainStationDistanceEntity=new TrainStationDistanceEntity();
        TrainStationEntity s= trainStationDao.getByName(start);
        TrainStationEntity e=trainStationDao.getByName(end);
        trainStationDistanceEntity.setDistance(distance);
        trainStationDistanceEntity.setTrainStationByStart(s);
        trainStationDistanceEntity.setTrainStationByEnd(e);
        trainStationDistanceDao.add(trainStationDistanceEntity);
    }

    @Override
    public void delete(Integer id) {
        trainStationDistanceDao.delete(id);
    }

    @Override
    public void update(Integer id, Double distance) {
        trainStationDistanceDao.update(id,distance);
    }
}
