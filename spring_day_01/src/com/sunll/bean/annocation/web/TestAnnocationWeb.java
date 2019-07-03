package com.sunll.bean.annocation.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 9:52
 */
public class TestAnnocationWeb {
    public static void main(String[] args) {
        String xmlPath = "com/sunll/bean/annocation/web/beans.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        StudentAction studentAction1 = applicationContext.getBean("studentActionId", StudentAction.class);
        StudentAction studentAction2 = applicationContext.getBean("studentActionId", StudentAction.class);
        System.out.println(studentAction1);
        System.out.println(studentAction2);
        studentAction1.execute();
        applicationContext.close();
    }
}
