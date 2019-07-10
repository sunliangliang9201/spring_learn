package com.sunll.ssm.service.impl;

import com.sunll.ssm.mapper.ItemsMapper;
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
}
