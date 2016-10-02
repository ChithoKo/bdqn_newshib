package com.bdqn.hib.test;

import com.bdqn.hib.pojo.User;
import com.bdqn.hib.service.UserService;
import com.bdqn.hib.service.impl.UserServiceImpl;

public class TestUser {	
	public static void main(String[] args){
		UserService us = new UserServiceImpl();
		System.out.println(us.getUser(1).getUname());
		User user = new User("Amy","323");
		user.setUid(2);
		us.alterUser(user);
		us.deleteUser(user);
	}
}
