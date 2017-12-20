package com.saltyfish.querytickets.dao.impl;

import com.saltyfish.querytickets.dao.TrainDao;
import com.saltyfish.querytickets.model.TrainEntity;
import com.saltyfish.querytickets.tools.HibernateTools;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TrainDaoImpl extends HibernateTools implements TrainDao {

    private String hql;

    public void add(TrainEntity trainEntity) {
        getSession().save(trainEntity);
    }

    public void delete(Integer id) {
        hql = "DELETE FROM TrainEntity t WHERE t.id = ?";
        getSession().createQuery(hql).setParameter(0, id).executeUpdate();
    }

    public void update(TrainEntity trainEntity) {
        getSession().update(trainEntity);
    }

    public List queryByNumber(String number) {
        hql = "FROM TrainEntity t WHERE t.number = ?";
        return getSession().createQuery(hql).setParameter(0, number).list();
    }
}
