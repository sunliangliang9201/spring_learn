package com.sunll.mybatis.dao;

import com.sunll.mybatis.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {

    ApplicationContext applicationContext;

    @Before
    public void setUp(){
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

    }

    @Test
    public void findUserById() {
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User user = userDao.findUserById(1);
        System.out.println(user);

    }
}