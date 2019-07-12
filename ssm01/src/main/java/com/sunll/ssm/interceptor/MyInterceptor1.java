package com.sunll.ssm.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/12 11:07
 */
public class MyInterceptor1 implements HandlerInterceptor {

    //在处理器映射器之前执行

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("这是第一个拦截器MyInterceptor1...preHandle");
        return true;
    }

    //还没有调用controller或者说还没有返回ModelAndView时执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System  .out.println("这是第一个拦截器MyInterceptor1...postHandle");

    }

    //返回ModelAndView之后再执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System  .out.println("这是第一个拦截器MyInterceptor1...afterCompletion");

    }
}
