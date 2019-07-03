package com.sunll.aop.proxy.cglib;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 17:37
 */
public class UserServiceImpl {

    public void addUser() {
        System.out.println("jdk add user");

    }

    public void updateUser() {
        System.out.println("jdk update user");
    }

    public void deleteUser() {
        System.out.println("jdk delete user");
    }
}
