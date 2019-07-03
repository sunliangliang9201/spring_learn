package com.sunll.bean.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 9:52
 */
public class TestLifeCycle {
    public static void main(String[] args) throws Exception {
        String xmlPath = "com/sunll/bean/lifecycle/beans.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = applicationContext.getBean("userServiceId", UserService.class);
        userService.addUser();
        //想要销毁Bean，必须要关闭容器,同时bean必须是单例的
        //applicationContext.getClass().getMethod("close").invoke(applicationContext);
        applicationContext.close();
    }
}
