package com.sunll.mybatis.po;

import java.util.List;

public class OrdersExt extends Orders {

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private String username;

    public String getUsername() {
        return username;
    }

    public String getSex() {
        return sex;
    }

    private String sex;

    private User user;


    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "OrdersExt{" +
                "username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }
}
