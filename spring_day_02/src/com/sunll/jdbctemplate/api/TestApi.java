package com.sunll.jdbctemplate.api;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/4 15:18
 */
public class TestApi {
    public static void main(String[] args) {
        //创建数据源（也就是连接池,先用DBCP的）
        BasicDataSource dataSource = new BasicDataSource();
        //基本4项
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://103.26.158.182:3306/spring");
        dataSource.setUsername("spring");
        dataSource.setPassword("spring");

        //创建模板
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);

        //通过api操作
        jdbcTemplate.update("insert into t_user(username, password) values(?,?)", "sunll", "sunll");

    }
}
