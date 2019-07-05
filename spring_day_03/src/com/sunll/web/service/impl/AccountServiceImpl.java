package com.sunll.web.service.impl;

import com.sunll.web.dao.AccountDao;
import com.sunll.web.service.AccountService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
    public void transfer(String outer, String inner, int money) {
        accountDao.out(outer, money);
        //模拟断电
        //int i = 1/0;
        accountDao.in(inner, money);
    }
}
