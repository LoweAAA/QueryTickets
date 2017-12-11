package com.saltyfish.querytickets.dao.impl;

import com.saltyfish.querytickets.dao.TrainStationDao;
import com.saltyfish.querytickets.model.TrainStationEntity;
import com.saltyfish.querytickets.tools.HibernateTools;

import java.util.List;

public class TrainStationDaoImpl extends HibernateTools implements TrainStationDao {

    private String hql = "";

    public List<TrainStationEntity> getAll() {
        hql = "FROM TrainStationEntity";
        return getSession().createQuery(hql).list();
    }
}
