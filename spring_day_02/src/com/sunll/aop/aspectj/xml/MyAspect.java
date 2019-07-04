package com.sunll.aop.aspectj.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 17:40
 */
public class MyAspect {

    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置 通知" + joinPoint.getSignature().getName());
    }

    public void myAfterReturning(JoinPoint joinPoint, Object returning){
        System.out.println("后置 通知" + joinPoint.getSignature().getName() + returning);
    }

    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环 前");
        //手动执行目标方法
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("环 后");
        return obj;
    }

    public void myAfterThrowing(JoinPoint joinPoint, Throwable e){
        System.out.println("跑出异常啦" + e.getMessage());
    }

    public void myAfter(JoinPoint joinPoint){
        System.out.println("最终");
    }
}
