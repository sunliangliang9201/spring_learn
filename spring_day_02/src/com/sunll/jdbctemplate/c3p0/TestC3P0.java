package com.sunll.jdbctemplate.c3p0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/4 17:13
 */
public class TestC3P0 {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setUsername("hello");
        user.setPassword("997");

        String xmlPath = "com\\sunll\\jdbctemplate\\c3p0\\beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = applicationContext.getBean("userDaoId", UserDao.class);
        userDao.update(user);
        for(User u: userDao.findAll()){
            System.out.println(u);
        }
    }
}
