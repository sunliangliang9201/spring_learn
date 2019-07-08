package com.sunll.mybatis;

import static org.junit.Assert.assertTrue;

import com.sunll.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * 第一个测试
     */
    @Test
    public void findUserById() throws Exception {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession= sessionFactory.openSession();
        User user = sqlSession.selectOne("test.findUserById",1);
        System.out.println(user.getSex());
        sqlSession.close();
    }
    /**
     * 模糊查询
     */
    @Test
    public void findUsersByName() throws Exception {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession= sessionFactory.openSession();
        List<User> users = sqlSession.selectList("test.findUsersByName","小明");
        System.out.println(users);
        sqlSession.close();
    }

    /**
     * 添加用户
     */
    @Test
    public void insertUser() throws Exception {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession= sessionFactory.openSession();
        User user = new User();
        user.setUsername("孙亮亮2");
        user.setAddress("回龙观");
        int res = sqlSession.insert("test.insertUser",user);
        sqlSession.commit();
        System.out.println(res);
        System.out.println(user.getId());
        sqlSession.close();
    }
}
