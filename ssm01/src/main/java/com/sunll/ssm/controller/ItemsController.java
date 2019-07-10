package com.sunll.ssm.controller;

import com.sunll.ssm.po.Items;
import com.sunll.ssm.service.ItemsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/10 18:12
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Resource
    private ItemsService itemsService;

    //查询所有商品
    @RequestMapping("list")
    public String list(Model model){
        List<Items> list = itemsService.findAll();
        model.addAttribute("list", list);
        return "itemsList";
    }
}
