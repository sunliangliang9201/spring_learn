package com.sunll.ssm.service;

import com.sunll.ssm.po.Items;

import java.util.List;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/10 18:10
 */
public interface ItemsService {

    List<Items> findAll();

    Items findById(Integer id);

    void saveOrUpdate(Items item);
}
