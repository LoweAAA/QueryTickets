package com.saltyfish.querytickets.dao;

import com.saltyfish.querytickets.model.TrainPassByStationsEntity;

import java.util.List;

/**
 * 火车经过的站点的Dao
 *
 * @author 颜贤锋
 */
public interface TrainPassByStationDao {

    /**
     * 增加火车经过站点
     *
     * @param trainPassByStationsEntity
     */
    void add(TrainPassByStationsEntity trainPassByStationsEntity);

    /**
     * 删除火车经过站点
     *
     * @param id
     */
    void delete(Integer id);

    /**
     * 修改火车经过站点
     *
     * @param trainPassByStationsEntity
     */
    void update(TrainPassByStationsEntity trainPassByStationsEntity);

    /**
     * 获取所有火车过站信息
     *
     * @return
     */
    List getAll();
}
