package com.sunll.mybatis.mapper;

import com.sunll.mybatis.po.OrdersExt;
import com.sunll.mybatis.po.User;

import java.util.List;

public interface OrdersMapper {

    public List<OrdersExt> findOrdersAndUser();

    public List<OrdersExt> findOrdersAndUserRetMap();

    public List<OrdersExt> findOrdersAndDetailRstMap();

    public List<User> findUserAndItemsRstMap();
}
