package com.saltyfish.querytickets.dao;

import com.saltyfish.querytickets.model.LoginEntity;

import java.util.List;

public interface loginDao {

    public void add(LoginEntity loginEntity);

    public List<LoginEntity> getAll();
}
