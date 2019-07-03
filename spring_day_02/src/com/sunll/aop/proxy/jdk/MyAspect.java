package com.sunll.aop.proxy.jdk;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 17:40
 */
public class MyAspect {

    public void before(){
        System.out.println("鸡首");

    }

    public void after(){
        System.out.println("牛后");
    }
}
