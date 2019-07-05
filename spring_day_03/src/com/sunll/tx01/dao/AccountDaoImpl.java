package com.sunll.tx01.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/5 9:40
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Override
    public void out(String outer, int money) {

    }

    @Override
    public void in(String inter, int money) {

    }
}
