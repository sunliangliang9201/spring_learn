package com.sunll.mybatis.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/8 12:13
 */
public class User implements Serializable {
    private int id;
    private String username;
    private String sex;
    private Date birthday;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public String getSex() {
        return sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    private String address;

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
