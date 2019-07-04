package com.sunll.jdbctemplate.dbcp;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/4 17:09
 */
public class User {
    private Integer id;
    private String username;
    private String password;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
