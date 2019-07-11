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
        model.addAttribute("itemsList", list);
        return "itemsList";
    }
    //跳转到修改页面
    @RequestMapping("edit")
    public String edit(Integer id, Model model){
        //根据id查询商品
        Items item = itemsService.findById(id);
        //页面回显
        model.addAttribute("item", item);
        return "editItem";
    }
    //更新或保存
    @RequestMapping("saveOrUpdate")
    public String saveOrUpdate(Items item){
        System.out.println(item);
        itemsService.saveOrUpdate(item);
        return "redirect:list.do";
    }
    //根据id删除
    @RequestMapping("deleteById")
    public String deleteBuId(Integer id){
        itemsService.deleteById(id);
        return "redirect:list.do";
    }

    //批量删除，传入数组ids
    @RequestMapping("deleteByIds")
    public String deleteByIds(Integer[] id){
        for (Integer itemId: id
             ) {
            itemsService.deleteById(itemId);
        }
        return "redirect:list.do";
    }
}
