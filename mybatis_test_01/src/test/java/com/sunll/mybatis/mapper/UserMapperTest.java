package com.sunll.mybatis.mapper;

import com.sunll.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

public class UserMapperTest {

    SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void setUp() throws Exception {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }

    @Test
    public void findUserById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void insertUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("孙亮亮3");
        user.setAddress("回龙观");
        userMapper.insertUser(user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void findUserRstMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUserRstMap(28);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testOneLevelCache(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUserById(1);
        System.out.println(user);
        User user2 = userMapper.findUserById(1);
        System.out.println(user2);
        sqlSession.close();
    }

    @Test
    public void testTwoLevelCache(){
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        User user1 = userMapper1.findUserById(1);
        System.out.println(user1);
        sqlSession1.close();
        User user2 = userMapper2.findUserById(1);
        System.out.println(user2);

        sqlSession2.close();
    }
}