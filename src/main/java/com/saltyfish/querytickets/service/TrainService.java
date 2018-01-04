package com.saltyfish.querytickets.service;

import java.util.List;

public interface TrainService {
    List getall();

    void add(String number,Integer specialSeat,Integer firstSeat,Integer secondSeat,Integer softSeat,Integer hardSeat,Integer noSeat,Integer highSleeper,Integer softSleeper,Integer hardSleeper);

    void update(Integer id,String number,Integer specialSeat,Integer firstSeat,Integer secondSeat,Integer softSeat,Integer hardSeat,Integer noSeat,Integer highSleeper,Integer softSleeper,Integer hardSleeper);

    void delete(Integer id);
}
