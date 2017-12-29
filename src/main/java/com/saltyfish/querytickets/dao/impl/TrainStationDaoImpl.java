package com.saltyfish.querytickets.dao.impl;

import com.saltyfish.querytickets.dao.TrainStationDao;
import com.saltyfish.querytickets.model.TrainStationEntity;
import com.saltyfish.querytickets.tools.HibernateTools;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TrainStationDaoImpl extends HibernateTools implements TrainStationDao {

    private String hql;

    public List<TrainStationEntity> getAll() {
        hql = "FROM TrainStationEntity";
        return getSession().createQuery(hql).list();
    }

    public void add(TrainStationEntity trainStationEntity) {
        getSession().save(trainStationEntity);
    }

    public void delete(Integer id) {
        hql="DELETE FROM TrainStationEntity t WHERE t.id = ?";
        getSession().createQuery(hql).setParameter(0,id).executeUpdate();
    }

    public void update(TrainStationEntity trainStationEntity) {
        getSession().update(trainStationEntity);
    }

    @Override
    public TrainStationEntity getByName(String name) {
        hql="FROM TrainStationEntity g WHERE g.station=?";
        return (TrainStationEntity)getSession().createQuery(hql).setParameter(0,name).uniqueResult();
    }
}
