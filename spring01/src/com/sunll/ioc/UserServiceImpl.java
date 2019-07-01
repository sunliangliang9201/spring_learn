package com.sunll.ioc;

public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("ioc add user");
    }
}
