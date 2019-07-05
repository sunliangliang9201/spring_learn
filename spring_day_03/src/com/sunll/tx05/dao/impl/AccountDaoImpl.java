package com.sunll.tx05.dao.impl;

import com.sunll.tx05.dao.AccountDao;
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
        this.getJdbcTemplate().update("update account set money = money - ? where username = ?",money, outer);
    }

    @Override
    public void in(String inner, int money) {
        this.getJdbcTemplate().update("update account set money = money + ? where username = ?",money, inner);
    }
}
