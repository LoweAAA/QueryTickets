package com.saltyfish.querytickets.dao.impl;

import com.saltyfish.querytickets.dao.LoginDao;
import com.saltyfish.querytickets.model.LoginEntity;
import com.saltyfish.querytickets.tools.HibernateTools;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 登陆Dao实现
 *
 * @author zjh514514
 */
@Repository
public class LoginDaoImpl extends HibernateTools implements LoginDao {

    private String hql;

    public void add(LoginEntity loginEntity) {
        getSession().save(loginEntity);
    }

    public void delete(Integer id) {
        hql = "DELETE FROM LoginEntity l WHERE l.id = ?";
        getSession().createQuery(hql).setParameter(0, id).list();
    }

    public void update(LoginEntity loginEntity) {
        hql = "UPDATE LoginEntity l SET l.password = ? , l.name = ?";
        getSession().createQuery(hql).setParameter(0, loginEntity.getPassword()).setParameter(1, loginEntity.getName()).executeUpdate();
    }

    public List<LoginEntity> getAll(Integer type) {
        hql = "FROM LoginEntity l WHERE l.type = ?";
        return getSession().createQuery(hql).setParameter(0, type).list();
    }

    public LoginEntity queryByUsername(String username) {
        hql = "FROM LoginEntity l WHERE l.username = ?";
        return (LoginEntity) getSession().createQuery(hql).setParameter(0, username).uniqueResult();
    }

}
