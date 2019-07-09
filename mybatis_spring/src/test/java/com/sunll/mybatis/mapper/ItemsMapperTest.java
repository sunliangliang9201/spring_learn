package com.sunll.mybatis.mapper;

import com.sunll.mybatis.po.Items;
import com.sunll.mybatis.po.ItemsExample;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class ItemsMapperTest {

    ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    }

    @Test
    public void selectByExample() {
        ItemsMapper mapper = applicationContext.getBean("itemsMapper", ItemsMapper.class);
        ItemsExample example = new ItemsExample();
        ItemsExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(1);
        List<Items> list = mapper.selectByExample(example);
        for (Items items: list
             ) {
            System.out.println(items);
        }
    }
}