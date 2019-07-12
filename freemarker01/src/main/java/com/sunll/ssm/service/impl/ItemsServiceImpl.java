package com.sunll.ssm.service.impl;

import com.sunll.ssm.dao.ItemsMapper;
import com.sunll.ssm.po.Items;
import com.sunll.ssm.service.ItemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/10 18:11
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Resource
    private ItemsMapper itemsMapper;

    @Override
    public List<Items> findAll() {
        List<Items> list = itemsMapper.findAll();
        return list;
    }

    @Override
    public Items findById(Integer id) {
        Items item = itemsMapper.selectByPrimaryKey(id);
        return item;
    }

    @Override
    public void saveOrUpdate(Items item) {
        itemsMapper.updateByPrimaryKey(item);
    }

    @Override
    public void deleteById(Integer id) {
        itemsMapper.deleteByPrimaryKey(id);
    }
}
