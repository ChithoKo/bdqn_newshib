package com.bdqn.hib.dao;

import java.io.Serializable;

import com.bdqn.hib.pojo.User;

public interface UserDAO {
	User getUser(Serializable id);
	void alterUser(User user);
	void deleteUser(User user);
}
