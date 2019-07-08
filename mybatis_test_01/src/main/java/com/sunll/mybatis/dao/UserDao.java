package com.sunll.mybatis.dao;

import com.sunll.mybatis.po.User;

import java.util.List;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/8 15:20
 */
public interface UserDao {

    public User findUserById(int id);

    public List<User> findUsersByName(String name);

    public void insertUser(User user);
}
