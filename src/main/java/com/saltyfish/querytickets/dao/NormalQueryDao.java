package com.saltyfish.querytickets.dao;

import java.util.Date;
import java.util.List;

/**
 * 视图查询
 *
 * @author 张家豪
 */
public interface NormalQueryDao {

    /**
     * 根据车站查询
     *
     * @param station
     * @return
     */
    List queryByStation(String station);

    /**
     * 根据车号查询
     *
     * @param number
     * @return
     */
    List queryByNumber(String number);

    /**
     * 获取某列车进过某站点时间
     *
     * @param number
     * @param station
     * @return
     */
    Date queryTime(String number, String station);
}
