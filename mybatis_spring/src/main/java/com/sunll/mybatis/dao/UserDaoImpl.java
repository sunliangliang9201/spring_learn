package com.sunll.mybatis.dao;

import com.sunll.mybatis.po.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/8 15:21
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    public User findUserById(int id) {
        return this.getSqlSession().selectOne("test.findUserById", 1);
    }
}
