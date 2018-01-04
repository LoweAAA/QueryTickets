package com.saltyfish.querytickets.service.serviceimpl;

import com.saltyfish.querytickets.dao.TrainDao;
import com.saltyfish.querytickets.model.TrainEntity;
import com.saltyfish.querytickets.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainServiceImpl implements TrainService{

    @Autowired
    private TrainDao trainDao;

    @Override
    public List getall() {
        return trainDao.getall();
    }

    @Override
    public void add(String number, Integer specialSeat, Integer firstSeat, Integer secondSeat, Integer softSeat, Integer hardSeat, Integer noSeat, Integer highSleeper, Integer softSleeper, Integer hardSleeper) {
        TrainEntity trainEntity=new TrainEntity();
        trainEntity.setNumber(number);
        trainEntity.setSpecialSeat(specialSeat);
        trainEntity.setFirstSeat(firstSeat);
        trainEntity.setSecondSeat(secondSeat);
        trainEntity.setSoftSeat(softSeat);
        trainEntity.setHardSeat(hardSeat);
        trainEntity.setNoSeat(noSeat);
        trainEntity.setHighSleeper(highSleeper);
        trainEntity.setSoftSleeper(softSleeper);
        trainEntity.setHardSleeper(hardSleeper);
        trainDao.add(trainEntity);
    }

    @Override
    public void update(Integer id, String number, Integer specialSeat, Integer firstSeat, Integer secondSeat, Integer softSeat, Integer hardSeat, Integer noSeat, Integer highSleeper, Integer softSleeper, Integer hardSleeper) {
        TrainEntity trainEntity=new TrainEntity();
        trainEntity.setId(id);
        trainEntity.setNumber(number);
        trainEntity.setSpecialSeat(specialSeat);
        trainEntity.setFirstSeat(firstSeat);
        trainEntity.setSecondSeat(secondSeat);
        trainEntity.setSoftSeat(softSeat);
        trainEntity.setHardSeat(hardSeat);
        trainEntity.setNoSeat(noSeat);
        trainEntity.setHighSleeper(highSleeper);
        trainEntity.setSoftSleeper(softSleeper);
        trainEntity.setHardSleeper(hardSleeper);
        trainDao.update(trainEntity);
    }

    @Override
    public void delete(Integer id) {
        trainDao.delete(id);
    }
}
