package com.sunll.mybatis.dao;

import com.sunll.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

public class UserDaoTest {

    SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void setUp() throws Exception {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }

    @Test
    public void findUserById() {
        UserDao dao  = new UserDaoImpl(sqlSessionFactory);
        User user = dao.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void findUsersByName() {
    }

    @Test
    public void insertUser() {
    }
}