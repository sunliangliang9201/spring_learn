package com.sunll.mybatis.dao;

import com.sunll.mybatis.po.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/8 15:21
 */
public class UserDaoImpl implements UserDao {

    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
        super();
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public void insertUser(User user) {
        // 创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 调用SqlSession的增删改查方法
        // 第一个参数：表示statement的唯一标示
        sqlSession.insert("test.insertUser", user);
        System.out.println(user.getId());
        // 提交事务
        sqlSession.commit();
        // 关闭资源
        sqlSession.close();
    }

    @Override
    public List<User> findUsersByName(String name) {
        // 创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 调用SqlSession的增删改查方法
        // 第一个参数：表示statement的唯一标示
        List<User> list = sqlSession.selectOne("test.findUsersByName", name);
        System.out.println(list);
        // 关闭资源
        sqlSession.close();
        return list;
    }

    @Override
    public User findUserById(int id) {
        // 创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 调用SqlSession的增删改查方法
        // 第一个参数：表示statement的唯一标示
        User user = sqlSession.selectOne("test.findUserById", id);
        System.out.println(user);
        // 关闭资源
        sqlSession.close();
        return user;

    }
}
