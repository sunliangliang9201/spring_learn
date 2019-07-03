package com.sunll.aop.proxy.cglib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 17:42
 */
public class MyBeanFactory {

    public static UserServiceImpl createUserService(){
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        MyAspect myAspect = new MyAspect();

        return userServiceImpl;
    }
}
