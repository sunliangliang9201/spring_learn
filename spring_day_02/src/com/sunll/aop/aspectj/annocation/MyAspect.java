package com.sunll.aop.aspectj.annocation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 17:40
 */

@Component
@Aspect
public class MyAspect {

    @Before("execution(* com.sunll.aop.aspectj.annocation.UserServiceImpl.*(..))")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置 通知" + joinPoint.getSignature().getName());
    }

    //生命公共切入点
    @Pointcut("execution(* com.sunll.aop.aspectj.annocation.UserServiceImpl.*(..))")
    private void myPointCut(){ }

    @AfterReturning(value = "myPointCut()", returning = "returning")
    public void myAfterReturning(JoinPoint joinPoint, Object returning){
        System.out.println("后置 通知" + joinPoint.getSignature().getName() + returning);
    }

    @Around(value = "myPointCut()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环 前");
        //手动执行目标方法
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("环 后");
        return obj;
    }
    @AfterThrowing(value = "myPointCut()", throwing = "e")
    public void myAfterThrowing(JoinPoint joinPoint, Throwable e){
        System.out.println("跑出异常啦" + e.getMessage());
    }

    @After("myPointCut()")
    public void myAfter(JoinPoint joinPoint){
        System.out.println("最终");
    }
}
