package com.sunll.bean.factory;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 9:48
 */
public class MyBeanFactory {

    public UserService createUserService(){
        return new UserServiceImpl();
    }
}
