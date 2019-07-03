package com.sunll.bean.scope;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("factory add user");
	}

}
