package com.sunll.aop.proxy.jdk;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 17:37
 */
public class UserServiceImpl implements UserService {

    @Override
    public void addUser() {
        System.out.println("jdk add user");

    }

    @Override
    public void updateUser() {
        System.out.println("jdk update user");
    }

    @Override
    public void deleteUser() {
        System.out.println("jdk delete user");
    }
}
