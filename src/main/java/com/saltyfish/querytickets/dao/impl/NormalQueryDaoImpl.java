package com.saltyfish.querytickets.dao.impl;

import com.saltyfish.querytickets.dao.NormalQueryDao;
import com.saltyfish.querytickets.tools.HibernateTools;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NormalQueryDaoImpl extends HibernateTools implements NormalQueryDao {

    String hql;

    public List queryByStation(String station) {
        hql = "FROM NormalQueryEntity n WHERE n.id.station = ?";
        return getSession().createQuery(hql).setParameter(0, station).list();
    }
}
