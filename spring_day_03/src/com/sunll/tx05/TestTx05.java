package com.sunll.tx05;


import com.sunll.tx05.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/5 9:55
 */
public class TestTx05 {
    public static void main(String[] args) {
        String xmlPath = "com\\sunll\\tx05\\applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        AccountService accountService = applicationContext.getBean("accountServiceId", AccountService.class);
        accountService.transfer("jack", "rose", 1000);
    }
}
