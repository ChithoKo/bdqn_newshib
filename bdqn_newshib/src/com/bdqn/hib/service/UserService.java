package com.bdqn.hib.service;

import java.io.Serializable;

import com.bdqn.hib.pojo.User;

public interface UserService {
	User getUser(Serializable id);
	void alterUser(User user);
	void deleteUser(User user);
}
