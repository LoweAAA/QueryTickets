package com.saltyfish.querytickets.tools;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * 获取hibernate的SessionFactory，不使用HibernateTemplate，减少各个框架的耦合
 */
public class HibernateTools {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }
}
