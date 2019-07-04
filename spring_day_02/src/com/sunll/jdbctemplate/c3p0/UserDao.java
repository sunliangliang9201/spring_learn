package com.sunll.jdbctemplate.c3p0;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;

import java.util.List;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/4 16:55
 */
public class UserDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void update(User user){
        String sql = "update t_user set username=?, password=? where id =?";
        Object[] args = {user.getUsername(),user.getPassword(),user.getId()};
        jdbcTemplate.update(sql, args);
    }

    public List<User> findAll(){
        String sql = "select id, username, password from t_user";
        return jdbcTemplate.query(sql, ParameterizedBeanPropertyRowMapper.newInstance(User.class));
    }
}
