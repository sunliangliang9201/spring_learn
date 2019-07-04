package com.sunll.aop.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

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

        //代理类,采用cglib的话，底层是创建目标类的子类
        //1.核心类
        Enhancer enhancer = new Enhancer();
        //2.确定父类
        enhancer.setSuperclass(userServiceImpl.getClass());
        //3.设置回调函数，这里的MethodInterceptor类似于JDK中的InvocationHandler接口
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                myAspect.before();
                Object obj = method.invoke(userServiceImpl, objects);
                myAspect.after();
                return obj;
            }
        });
        //4.获取代理对象
        UserServiceImpl proxyServiceImpl = (UserServiceImpl) enhancer.create();

        return proxyServiceImpl;
    }
}
