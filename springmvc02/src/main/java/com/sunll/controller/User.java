package com.sunll.controller;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/10 9:52
 */
@XmlRootElement
public class User {
    private Integer id;
    private String username;
    private String age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age='" + age + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    private Date birthday;
    private String address;
}
