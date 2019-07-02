package com.sunll.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoC {

	public static void main(String[] args) {
		//之前开发
//		UserService userService = new UserServiceImpl();
//		userService.addUser();
		//从spring容器获得
		//1 获得容器
		String xmlPath = "com/sunll/ioc/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		//2获得内容 --不需要自己new，都是从spring容器获得
		UserService userService = (UserService) applicationContext.getBean("userServiceId");
		userService.addUser();
	}
}
