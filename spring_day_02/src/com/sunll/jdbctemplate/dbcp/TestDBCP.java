package com.sunll.jdbctemplate.dbcp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/4 17:13
 */
public class TestDBCP {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setUsername("hello");
        user.setPassword("998");

        String xmlPath = "com\\sunll\\jdbctemplate\\dbcp\\beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = applicationContext.getBean("userDaoId", UserDao.class);
        userDao.update(user);
    }
}
