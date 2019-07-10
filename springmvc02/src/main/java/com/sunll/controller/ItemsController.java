package com.sunll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/10 14:36
 */
@Controller
@RequestMapping("items")
public class ItemsController {

    @RequestMapping("list")
    public String list(){
        System.out.println("11111111111111111111111111111111111");
        return "success";
    }
}
