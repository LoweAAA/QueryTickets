package com.saltyfish.querytickets.dao;

import com.saltyfish.querytickets.model.LoginEntity;

import java.util.List;

/**
 * 管理员登陆注册修改信息
 *
 * @author 张家豪
 */
public interface LoginDao {

    /**
     * 添加信息
     *
     * @param loginEntity
     */
    public void add(LoginEntity loginEntity);

    /**
     * 删除账户
     *
     * @param id
     */
    public void delete(Integer id);

    /**
     * 修改账户信息
     *
     * @param loginEntity
     */
    public void update(LoginEntity loginEntity);

    /**
     * 查询所有普通用户信息
     *
     * @return
     */
    public List<LoginEntity> getAll(Integer type);

    /**
     * 获取登陆信息
     *
     * @param username
     * @return
     */
    public LoginEntity queryByUsername(String username);
}
