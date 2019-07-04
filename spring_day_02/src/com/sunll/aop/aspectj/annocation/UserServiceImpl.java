package com.sunll.aop.aspectj.annocation;

import org.springframework.stereotype.Service;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 17:37
 */
@Service("userServiceId")
public class UserServiceImpl implements UserService {

    @Override
    public void addUser() { System.out.println("aspectj annocation add user"); }
    @Override
    public String updateUser() {
        //int i = 1/0;
        System.out.println("aspectj annocation update user");
        return "嘿嘿";
    }

    @Override
    public void deleteUser() {
        System.out.println("aspectj annocation delete user");
    }

}
