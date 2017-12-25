package com.saltyfish.querytickets.service;

import com.saltyfish.querytickets.model.LoginEntity;

import java.util.List;

public interface LoginService {
    public LoginEntity loginConfirm(String username,String password);

    public List getAccount(Integer type);

    public void addAccount(LoginEntity loginEntity);

    public void delete(Integer id);

    public void update(LoginEntity loginEntity);
}
