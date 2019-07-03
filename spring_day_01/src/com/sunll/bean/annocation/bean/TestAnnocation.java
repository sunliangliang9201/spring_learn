package com.sunll.bean.annocation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 9:52
 */
public class TestAnnocation {
    public static void main(String[] args) {
        String xmlPath = "com/sunll/bean/annocation/bean/beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = applicationContext.getBean("userServiceId", UserService.class);
        userService.addUser();
    }
}
