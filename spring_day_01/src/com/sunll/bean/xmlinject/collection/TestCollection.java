package com.sunll.bean.xmlinject.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 14:37
 */
public class TestCollection {
    public static void main(String[] args) {
        String xmlPath = "com/sunll/bean/xmlinject/collection/beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        CollData collData = (CollData) applicationContext.getBean("collDataId");
        System.out.println(collData);
    }
}
