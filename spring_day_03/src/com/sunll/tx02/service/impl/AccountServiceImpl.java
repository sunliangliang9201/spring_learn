package com.sunll.tx02.service.impl;

import com.sunll.tx02.dao.AccountDao;
import com.sunll.tx02.service.AccountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/5 9:48
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String outer, String inner, int money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.out(outer, money);
                //模拟断电
                //int i = 1/0;
                accountDao.in(inner, money);
            }
        });
    }
}
