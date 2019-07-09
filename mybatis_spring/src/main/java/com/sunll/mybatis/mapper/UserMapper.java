package com.sunll.mybatis.mapper;

import com.sunll.mybatis.po.User;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/9 16:07
 */
public interface UserMapper {

    public User findUserById(int id);
}
