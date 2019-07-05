package com.sunll.dao.impl;

import com.sunll.dao.UserDao;
import com.sunll.domain.User;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/5 14:40
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public void save(User user) {
        this.getHibernateTemplate().save(user);
    }
}
