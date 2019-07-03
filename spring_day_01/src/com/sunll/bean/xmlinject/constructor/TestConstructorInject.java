package com.sunll.bean.xmlinject.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 12:42
 */
public class TestConstructorInject {
    public static void main(String[] args) {
        String xmlPath = "com/sunll/bean/xmlinject/constructor/beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        User user = applicationContext.getBean("userId", User.class);
        System.out.println(user);
    }
}
