package com.saltyfish.querytickets.dao;

import java.util.List;

public interface NormalQueryDao {

    /**
     * 根据车站查询
     *
     * @param station
     * @return
     */
    List queryByStation(String station);
}
