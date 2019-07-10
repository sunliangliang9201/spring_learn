package com.sunll.controller;

import com.sunll.domain.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/10 9:50
 */
//从页面接收参数，封装到javabean中
public class CommandController extends AbstractCommandController {

    //指定把参数封装到哪个对象
    public CommandController(){
        this.setCommandClass(User.class);
    }

    @Override
    protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        //值被封装命令对象
        User user = (User) command;
        ModelAndView mv = new ModelAndView();
        //设置model数据，值可以是任意pojo
        mv.addObject("user", user);
        mv.setViewName("index");
        return mv;
    }

    @Override
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        String str = request.getParameter("birthday");
        if(str.contains("/")){
            binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy/MM/dd"), true));

        }else{
            binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
        }
    }
}
