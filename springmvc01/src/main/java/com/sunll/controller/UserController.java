package com.sunll.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/9 22:56
 */
public class UserController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //接受请求、接收参数、验证参数、处理请求
        //封装参数、调用业务方法、返回处理结果数据
        ModelAndView mv = new ModelAndView();
        //给模型视图ModelAndView设置数据，可以在页面回显
        mv.addObject("hello", "凤姐喜欢你");
        //设置一个物理视图
        //mv.setViewName("/WEB-INF/jsps/index.jsp");
        //设置一个逻辑视图
        mv.setViewName("index");
        return mv;
    }
}

