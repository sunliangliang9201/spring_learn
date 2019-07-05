package com.sunll.service.impl;

import com.sunll.dao.UserDao;
import com.sunll.domain.User;
import com.sunll.service.UserService;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/5 14:46
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void register(User user) {
        userDao.save(user);
    }
}
