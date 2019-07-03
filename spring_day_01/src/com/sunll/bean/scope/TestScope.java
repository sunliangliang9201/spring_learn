package com.sunll.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 9:52
 */
public class TestScope {
    public static void main(String[] args) {
        String xmlPath = "com/sunll/bean/scope/beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService1 = applicationContext.getBean("userServiceId", UserService.class);
        System.out.println(userService1);

        UserService userService2 = applicationContext.getBean("userServiceId", UserService.class);
        System.out.println(userService2);

    }
}
