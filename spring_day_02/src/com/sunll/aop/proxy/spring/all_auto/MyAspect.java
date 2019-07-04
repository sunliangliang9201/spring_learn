package com.sunll.aop.proxy.spring.all_auto;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 切面类中确定通知，需要实现不同的接口
 * 采用环绕通知
 * @author sunliangliang
 * @date 2019/7/3 17:40
 */
public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("前");
        //手动执行目标方法
        Object obj = methodInvocation.proceed();
        System.out.println("后");
        return obj;
    }
}
