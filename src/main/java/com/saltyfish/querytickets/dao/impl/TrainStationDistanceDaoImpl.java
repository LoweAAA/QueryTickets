package com.saltyfish.querytickets.dao.impl;

import com.saltyfish.querytickets.dao.TrainStationDistanceDao;
import com.saltyfish.querytickets.model.TrainStationEntity;
import com.saltyfish.querytickets.tools.HibernateTools;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TrainStationDistanceDaoImpl extends HibernateTools implements TrainStationDistanceDao {

    private String hql;

    @Override
    public List getAll() {
        hql = "FROM TrainStationDistanceEntity";
        return getSession().createQuery(hql).list();
    }

    @Override
    public void add(TrainStationEntity trainStationEntity) {
        getSession().save(trainStationEntity);
    }

    @Override
    public void delete(Integer id) {
        hql = "DELETE FROM TrainStationDistanceEntity t WHERE t.id = ?";
        getSession().createQuery(hql).setParameter(0, id).executeUpdate();
    }

    @Override
    public void update(Integer id, Double distance) {
        hql = "UPDATE FROM TrainStationDistanceEntity  t SET t.distance = ? WHERE t.id = ?";
        getSession().createQuery(hql).setParameter(0, distance).setParameter(1, id).executeUpdate();
    }
}
