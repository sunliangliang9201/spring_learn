package com.sunll.bean.annocation.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 15:27
 */

@Controller("studentActionId")
@Scope("prototype")
public class StudentAction {

    @Autowired
    private StudentService studentService;

    public void execute(){
        studentService.addStudent();
    }

    @PostConstruct
    public void init(){
        System.out.println("controller bean 初始化了");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("controller bean 销毁了");
    }
}
