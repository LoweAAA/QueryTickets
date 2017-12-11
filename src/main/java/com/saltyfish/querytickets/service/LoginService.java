package com.saltyfish.querytickets.service;

import com.saltyfish.querytickets.model.LoginEntity;

public interface LoginService {
    public LoginEntity loginConfirm(String username,String password);
}
