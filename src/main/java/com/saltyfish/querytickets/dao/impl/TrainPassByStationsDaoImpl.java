package com.saltyfish.querytickets.dao.impl;

import com.saltyfish.querytickets.dao.TrainPassByStationsDao;
import com.saltyfish.querytickets.model.TrainEntity;
import com.saltyfish.querytickets.tools.HibernateTools;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TrainPassByStationsDaoImpl extends HibernateTools implements TrainPassByStationsDao {

    private String hql;

    public List getAll(TrainEntity train) {
        hql="FROM TrainPassByStationsEntity t WHERE t.train.number = ?";
        return getSession().createQuery(hql).setParameter(0,train).list();
    }
}
