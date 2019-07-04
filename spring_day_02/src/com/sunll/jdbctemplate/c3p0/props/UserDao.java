package com.sunll.jdbctemplate.c3p0.props;

import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/4 16:55
 */
public class UserDao extends JdbcDaoSupport {

    public void update(User user){
        String sql = "update t_user set username=?, password=? where id =?";
        Object[] args = {user.getUsername(),user.getPassword(),user.getId()};
        this.getJdbcTemplate().update(sql, args);
    }

    public List<User> findAll(){
        String sql = "select id, username, password from t_user";
        return this.getJdbcTemplate().query(sql, ParameterizedBeanPropertyRowMapper.newInstance(User.class));
    }

    public User getById(int i){
        return this.getJdbcTemplate().queryForObject("select id, username, password from t_user where id=?", ParameterizedBeanPropertyRowMapper.newInstance(User.class),i);
    }
}
