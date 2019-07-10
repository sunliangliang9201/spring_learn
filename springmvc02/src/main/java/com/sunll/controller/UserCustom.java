package com.sunll.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/10 12:47
 */
public class UserCustom {

    private User user;
    private List<User> userList;
    private Map<String, Object> maps = new HashMap<>();

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
