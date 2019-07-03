package com.sunll.aop.proxy.jdk;

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

    public static UserService createUserService(){
        UserService userService = new UserServiceImpl();
        MyAspect myAspect = new MyAspect();
        UserService proxyService = (UserService) Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(),
                userService.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        myAspect.before();
                        Object obj = method.invoke(userService, args);
                        myAspect.after();
                        return obj;
                    }
                });
        return proxyService;
    }
}
