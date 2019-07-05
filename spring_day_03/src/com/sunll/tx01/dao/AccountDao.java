package com.sunll.tx01.dao;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/5 9:39
 */
public interface AccountDao {
    public void out(String outer, int money);
    public void in(String inter, int money);
}
