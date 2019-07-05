package com.sunll.junit;


import com.sunll.junit.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/5 9:55
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:com/sunll/junit/applicationContext.xml")
public class TestJunit {
    public static void main(String[] args) {
//        String xmlPath = "com\\sunll\\tx05\\applicationContext.xml";
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
//        AccountService accountService = applicationContext.getBean("accountServiceId", AccountService.class);
//        accountService.transfer("jack", "rose", 1000);
    }
    @Autowired
    private AccountService accountService;

    @Test
    public void test01(){
        accountService.transfer("jack", "rose", 1000);
    }
}
