package com.sunll.domain;

/**
 * javabean
 *
 * @author sunliangliang
 * @date 2019/7/5 14:27
 */
public class User {

    private int id;
    private String username;
    private String password;
    private int age;

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
}
