package com.sunll.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/12 10:30
 */
@Controller
@RequestMapping("ftl")
public class FtlController {

    @RequestMapping("hello")
    public String hello(Model model){
        model.addAttribute("hello", "页面静态化");
        return "ftl";
    }
}
