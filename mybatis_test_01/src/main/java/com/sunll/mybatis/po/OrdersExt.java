package com.sunll.mybatis.po;

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
}
