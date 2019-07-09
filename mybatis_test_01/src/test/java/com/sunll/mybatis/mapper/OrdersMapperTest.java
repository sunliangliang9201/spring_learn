package com.sunll.mybatis.mapper;

import com.sunll.mybatis.po.OrdersExt;
import com.sunll.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class OrdersMapperTest {

    SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void setUp() throws Exception {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }

//    @Test
//    public void findOrdersAndUser() {
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
//        List<OrdersExt> list = mapper.findOrdersAndUser();
//        for (OrdersExt res: list) {
//            System.out.println(res);
//        }
//        sqlSession.close();
//    }

    @Test
    public void findOrdersAndUserRetMap() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> list = mapper.findOrdersAndUserRetMap();
        for (OrdersExt res: list) {
            System.out.println(res);
        }
        sqlSession.close();
    }

    @Test
    public void findOrdersAndDetailRstMap() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> list = mapper.findOrdersAndDetailRstMap();
        for (OrdersExt res: list) {
            System.out.println(res);
        }
        sqlSession.close();
    }

    @Test
    public void findUserAndItemsRstMap() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<User> list = mapper.findUserAndItemsRstMap();
        for (User res: list) {
            System.out.println(res);
        }
        sqlSession.close();
    }

    @Test
    public void findOrdersAndUserLazyLoading() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> list = mapper.findOrdersAndUserLazyLoading();
//        for (OrdersExt res: list) {
//            System.out.println(res);
//        }
        sqlSession.close();
    }
}