package com.saltyfish.querytickets.service;

import com.saltyfish.querytickets.model.LoginEntity;

import java.util.List;

public interface LoginService {

    /**
     * 登陆验证
     *
     * @param username
     * @param password
     * @return
     */
    public LoginEntity loginConfirm(String username, String password);

    /**
     * 获取所有用户
     *
     * @param type
     * @return
     */
    public List getAccount(Integer type);

    /**
     * 增加用户
     *
     * @param loginEntity
     */
    public void addAccount(LoginEntity loginEntity);

    /**
     * 删除用户
     *
     * @param id
     */
    public void delete(Integer id);

    /**
     * 修改用户信息
     *
     * @param loginEntity
     */
    public void update(LoginEntity loginEntity);
}
