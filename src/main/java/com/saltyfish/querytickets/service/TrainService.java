package com.saltyfish.querytickets.service;

import java.util.List;

public interface TrainService {

    /**
     * 获取所有车次
     *
     * @return
     */
    List getall();

    /**
     * 增加车次
     *
     * @param number
     * @param specialSeat
     * @param firstSeat
     * @param secondSeat
     * @param softSeat
     * @param hardSeat
     * @param noSeat
     * @param highSleeper
     * @param softSleeper
     * @param hardSleeper
     */
    void add(String number, Integer specialSeat, Integer firstSeat, Integer secondSeat, Integer softSeat, Integer hardSeat, Integer noSeat, Integer highSleeper, Integer softSleeper, Integer hardSleeper);

    /**
     * 修改车次
     *
     * @param id
     * @param number
     * @param specialSeat
     * @param firstSeat
     * @param secondSeat
     * @param softSeat
     * @param hardSeat
     * @param noSeat
     * @param highSleeper
     * @param softSleeper
     * @param hardSleeper
     */
    void update(Integer id, String number, Integer specialSeat, Integer firstSeat, Integer secondSeat, Integer softSeat, Integer hardSeat, Integer noSeat, Integer highSleeper, Integer softSleeper, Integer hardSleeper);

    /**
     * 删除车次
     *
     * @param id
     */
    void delete(Integer id);
}
