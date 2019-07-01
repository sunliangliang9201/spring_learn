package com.sunll.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
    public static void main(String[] args){  
        String xmlPath = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        BookService bookService = (BookService)applicationContext.getBean("bookServiceId");
        bookService.add();
    }
}
