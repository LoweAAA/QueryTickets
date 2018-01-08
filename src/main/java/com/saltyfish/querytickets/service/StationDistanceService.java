package com.saltyfish.querytickets.service;

import java.util.List;

public interface StationDistanceService {

    /**
     * 获取所有站点距离信息
     *
     * @return
     */
    public List getAll();

    /**
     * 增加站点间距离
     *
     * @param distance
     * @param start
     * @param end
     */
    public void add(double distance, String start, String end);

    /**
     * 删除站点距离
     *
     * @param id
     */
    public void delete(Integer id);

    /**
     * 修改站点距离
     *
     * @param id
     * @param distance
     */
    public void update(Integer id, Double distance);
}
