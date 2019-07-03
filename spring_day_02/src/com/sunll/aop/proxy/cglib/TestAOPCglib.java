package com.sunll.aop.proxy.cglib;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 17:43
 */
public class TestAOPCglib {

    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = MyBeanFactory.createUserService();
        userServiceImpl.addUser();
        userServiceImpl.updateUser();
        userServiceImpl.deleteUser();
    }
}
