package com.sunll.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestDI {

	public static void main(String[] args) {
		//从spring容器获得
		String xmlPath = "com/sunll/di/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		BookService bookService = (BookService) applicationContext.getBean("bookServiceId");
		bookService.addBook();

		//使用BeanFactory  --第一次条用getBean实例化(懒加载)
		String xmlPath1 = "com/sunll/di/beans.xml";

		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(xmlPath1));

		BookService bookService1 = (BookService) beanFactory.getBean("bookServiceId");

		bookService1.addBook();
	}

}
