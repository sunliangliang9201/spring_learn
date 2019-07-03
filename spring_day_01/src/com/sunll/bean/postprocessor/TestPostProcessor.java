package com.sunll.bean.postprocessor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 9:52
 */
public class TestPostProcessor {
    public static void main(String[] args) throws Exception {
        String xmlPath = "com/sunll/bean/postprocessor/beans.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService)applicationContext.getBean("userServiceId");
        userService.addUser();
        //想要销毁Bean，必须要关闭容器,同时bean必须是单例的
        //applicationContext.getClass().getMethod("close").invoke(applicationContext);
        applicationContext.close();
    }
}
