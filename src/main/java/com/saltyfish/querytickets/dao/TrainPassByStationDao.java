package com.saltyfish.querytickets.dao;

import com.saltyfish.querytickets.model.TrainPassByStationsEntity;

import java.util.List;

/**
 * 火车经过的站点的Dao
 *
 * @author zjh514514
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

    List getAll();
}
