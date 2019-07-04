package com.sunll.aop.aspectj.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 17:43
 */
public class TestAspectXml {

    public static void main(String[] args) {
        String xmlPath = "com\\sunll\\aop\\aspectj\\xml\\beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        //获取代理类
        UserService proxyService = (UserService) applicationContext.getBean("userServiceId");
        proxyService.addUser();
        proxyService.updateUser();
        proxyService.deleteUser();
    }
}
