package com.sunll.aop.proxy.spring.half_auto;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 17:37
 */
public class UserServiceImpl implements UserService {

    @Override
    public void addUser() {
        System.out.println("spring half-auto add user");

    }

    @Override
    public void updateUser() {
        System.out.println("spring half-auto update user");
    }

    @Override
    public void deleteUser() {
        System.out.println("spring half-auto delete user");
    }
}
