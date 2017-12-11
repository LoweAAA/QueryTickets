package com.saltyfish.querytickets.service.serviceimpl;

import com.saltyfish.querytickets.dao.LoginDao;
import com.saltyfish.querytickets.model.LoginEntity;
import com.saltyfish.querytickets.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImlp implements LoginService{

    @Autowired
    private LoginDao loginDao;

    public LoginEntity loginConfirm(String username,String password) {

        LoginEntity loginEntity= loginDao.queryByUsername(username);
        if(loginEntity==null)
            return null;
        if(loginEntity.getPassword().equals(password))
            return loginEntity;
        else{
            return null;
        }

    }
}
