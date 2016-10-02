package com.bdqn.hib.service;

import java.util.List;

import com.bdqn.hib.pojo.User;

public interface UserHQLService {
	List<User> getAllUser();
	List<User> getUserByName(User user);
}
