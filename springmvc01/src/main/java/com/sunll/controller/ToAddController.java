package com.sunll.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/10 10:01
 */
public class ToAddController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //跳转到添加页面
        ModelAndView mv = new ModelAndView();
        mv.setViewName("add");
        return mv;
    }
}
