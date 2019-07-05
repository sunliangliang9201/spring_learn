package com.sunll.tx01.service.impl;

import com.sunll.tx01.dao.AccountDao;
import com.sunll.tx01.service.AccountService;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/5 9:48
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String outer, String inner, int money) {
        accountDao.out(outer, money);
        //模拟断电
        //int i = 1/0;
        accountDao.in(inner, money);
    }
}
