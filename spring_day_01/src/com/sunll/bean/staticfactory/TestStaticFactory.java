package com.sunll.bean.staticfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 静态工厂
 *
 */
public class TestStaticFactory {

	public static void main(String[] args) {
		String xmlPath = "com/sunll/bean/staticfactory/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService = applicationContext.getBean("userServiceId" ,UserService.class);
		userService.addUser();
	}
}
