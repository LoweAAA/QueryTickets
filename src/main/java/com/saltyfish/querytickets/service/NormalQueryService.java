package com.saltyfish.querytickets.service;

import java.util.List;

public interface NormalQueryService {

    /**
     * 查询经过两个站点的车次
     *
     * @param startStation
     * @param endStation
     * @return
     */
    List queryByStation(String startStation, String endStation);
}
