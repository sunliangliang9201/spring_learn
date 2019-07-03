package com.sunll.bean.xmlinject.constructor;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 12:40
 */
public class User {

    private Integer uid;
    private String userName;
    private Integer age;

    public User(Integer uid, String userName) {
        this.uid = uid;
        this.userName = userName;
    }

    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getUid() {
        return uid;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
