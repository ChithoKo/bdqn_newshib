package com.bdqn.hib.dao;

import java.util.List;

import com.bdqn.hib.pojo.User;

public interface UserHQLDAO extends GenericHQLDAO<User, Integer>{
	User getUser(Integer id);
	List<User> getAllUser();
	List<User> getByName(User user, String hql);
}
