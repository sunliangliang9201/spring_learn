package com.sunll.mybatis.mapper;

import com.sunll.mybatis.po.User;

import java.util.List;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/8 15:53
 */
public interface UserMapper {

    public User findUserById(int id);

    public void insertUser(User user);

    User findUserRstMap(int id);

}
