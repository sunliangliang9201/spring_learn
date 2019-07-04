package com.sunll.aop.aspectj.xml;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 17:37
 */
public class UserServiceImpl implements UserService {

    @Override
    public void addUser() { System.out.println("aspectj add user"); }
    @Override
    public String updateUser() {
        //int i = 1/0;
        System.out.println("aspectj update user");
        return "嘿嘿";
    }

    @Override
    public void deleteUser() {
        System.out.println("aspectj delete user");
    }

}
