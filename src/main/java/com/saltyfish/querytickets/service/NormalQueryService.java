package com.saltyfish.querytickets.service;

import java.util.List;

public interface NormalQueryService {

    /**
     * 查询经过两个站点的车次并排序
     *
     * @param startStation
     * @param endStation
     * @param type
     * @return
     */
    List order(String startStation, String endStation, String type);

    /**
     * 获取中转站点
     *
     * @param startStation
     * @param endStation
     * @return
     */
    List change(String startStation, String endStation);

    /**
     * 获取中转车次
     *
     * @param startStation
     * @param endStation
     * @param changeStation
     * @param order
     * @return
     */
    List changeTrain(String startStation, String endStation, String changeStation, String order);
}
