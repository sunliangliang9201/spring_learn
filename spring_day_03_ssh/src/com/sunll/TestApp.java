package com.sunll;

import com.sunll.domain.User;
import com.sunll.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/5 15:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestApp {

    @Autowired
    private UserService userService;

    @Test
    public void demo01(){
        User user = new User();
        user.setUsername("jack");
        user.setPassword("1234");
        user.setAge(30);
        userService.register(user);
    }
}
