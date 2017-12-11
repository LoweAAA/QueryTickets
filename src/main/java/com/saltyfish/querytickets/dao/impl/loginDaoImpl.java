package com.saltyfish.querytickets.dao.impl;

import com.saltyfish.querytickets.dao.loginDao;
import com.saltyfish.querytickets.model.LoginEntity;
import com.saltyfish.querytickets.tools.HibernateTools;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class loginDaoImpl extends HibernateTools implements loginDao {

    String hql = "";

    public void add(LoginEntity loginEntity) {
        getSession().save(loginEntity);
    }

    public List<LoginEntity> getAll() {
        hql = "FROM LoginEntity ";
        return getSession().createQuery(hql).list();
    }

}
