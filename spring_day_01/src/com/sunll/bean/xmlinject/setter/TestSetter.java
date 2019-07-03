package com.sunll.bean.xmlinject.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 12:42
 */
public class TestSetter {
    public static void main(String[] args) {
        String xmlPath = "com/sunll/bean/xmlinject/setter/beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        Person person = (Person) applicationContext.getBean("personId");
        System.out.println(person);
    }
}
