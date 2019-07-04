package com.sunll.aop.proxy.spring.all_auto;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 17:37
 */
public class UserServiceImpl implements UserService {

    @Override
    public void addUser() {
        System.out.println("spring all-auto add user");

    }

    @Override
    public void updateUser() {
        System.out.println("spring all-auto update user");
    }

    @Override
    public void deleteUser() {
        System.out.println("spring all-auto delete user");
    }
}
