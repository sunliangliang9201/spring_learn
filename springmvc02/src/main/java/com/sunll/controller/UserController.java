package com.sunll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/10 10:56
 */
@Controller//相当于在配置文件中配置bean，id就是userController class就是本class
@RequestMapping("register")
public class UserController {

    //@RequestMapping("/hello")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hmyHello(){

        return "hello";
    }


    //用于跳转到add.jsp
    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }


//    下面测试springmvc的参数封装

    //接收基本数据类型int
    @RequestMapping("recieveInt")
    public String recieveInt(Integer id){
        System.out.println(id);
        return "hello";
    }
    //接收基本数据类型 string（这里把string认为是基本类型）
    @RequestMapping("recieveString")
    public String recieveString(String name){
        System.out.println(name);
        return "hello";
    }
    //接收pojo
    @RequestMapping("recieveUser")
    public String recieveUser(User user){
        System.out.println(user);
        return "hello";
    }
    //接收包装类
    @RequestMapping("recieveUserCustom")
    public String recieveUserCustom(UserCustom userCustom){
        System.out.println(userCustom);
        return "hello";
    }
    //接收数组
    @RequestMapping("recieveArray")
    public String recieveArray(Integer[] ids){
        System.out.println(ids);
        return "hello";
    }
    //接收list，必须嵌套到包装类中才行
    @RequestMapping("recieveUserCustomList")
    public String recieveUserCustomList(UserCustom userCustom){
        System.out.println(userCustom.getUserList());
        return "hello";
    }
    //接收map，必须嵌套到包装类中才行
    @RequestMapping("recieveUserCustomMap")
    public String recieveUserCustomMap(UserCustom userCustom){
        System.out.println(userCustom.getMaps());
        return "hello";
    }

    //页面回显
    @RequestMapping("list")
    public String list(Model model){
        User user1 = new User();
        user1.setAddress("回龙观1");
        user1.setAge("27");
        user1.setBirthday(new Date());
        user1.setUsername("孙亮亮");
        user1.setId(1);
        User user2 = new User();
        user2.setAddress("回龙观2");
        user2.setAge("27");
        user2.setBirthday(new Date());
        user2.setUsername("孙亮亮");
        user2.setId(2);
        User user3 = new User();
        user3.setAddress("回龙观3");
        user3.setAge("27");
        user3.setBirthday(new Date());
        user3.setUsername("孙亮亮");
        user3.setId(3);
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        model.addAttribute("userList", list);
        return "list";
    }

    @RequestMapping("update/{id}")
    public String update(@PathVariable Integer id){
        System.out.println(id);

        return "redirect:/rest/list.do";
    }
    //测试转发
    @RequestMapping("forward")
    public String forward(){
        return "forward:/items/list.do";
    }

    //测试重定向
    @RequestMapping("redirect")
    public String redirect(){
        return "redirect:list.do";
    }

}
