package com.saltyfish.querytickets.dao.impl;

import com.saltyfish.querytickets.dao.TrainPassByStationDao;
import com.saltyfish.querytickets.model.TrainPassByStationsEntity;
import com.saltyfish.querytickets.tools.HibernateTools;
import org.springframework.stereotype.Repository;

@Repository
public class TrainPassByStationDaoImpl extends HibernateTools implements TrainPassByStationDao {

    private String hql;

    public void add(TrainPassByStationsEntity trainPassByStationsEntity) {
        getSession().save(trainPassByStationsEntity);
    }

    public void delete(Integer id) {
        hql = "DELETE FROM TrainPassByStationsEntity t WHERE t.id = ?";
        getSession().createQuery(hql).setParameter(0, id).executeUpdate();
    }

    public void update(TrainPassByStationsEntity trainPassByStationsEntity) {
        getSession().update(trainPassByStationsEntity);
    }

}
