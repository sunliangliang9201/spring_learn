package com.sunll.aop.proxy.jdk;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 17:43
 */
public class TestAOPJdk {

    public static void main(String[] args) {
        UserService userService = MyBeanFactory.createUserService();
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();
    }
}
