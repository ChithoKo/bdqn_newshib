package com.bdqn.hib.service.impl;

import java.io.Serializable;

import org.hibernate.Transaction;

import com.bdqn.hib.dao.UserDAO;
import com.bdqn.hib.dao.impl.UserDAOImpl;
import com.bdqn.hib.pojo.User;
import com.bdqn.hib.service.UserService;
import com.bdqn.hib.util.HibernateSessionFactory;

public class UserServiceImpl implements UserService{
	
	UserDAO userDAO = new UserDAOImpl();
	
	public User getUser(Serializable id){
		//调用HibernateSessionFactory中的静态方法getSession()来获得Session
		//开启事务，并获得事务对象
		Transaction transaction = HibernateSessionFactory.getSession().beginTransaction();
		User user = userDAO.getUser(id);
		transaction.commit();
		HibernateSessionFactory.getSession().close();
		return user;
	}
	
	public void alterUser(User user){
		Transaction transaction = HibernateSessionFactory.getSession().beginTransaction();
		userDAO.alterUser(user);
		transaction.commit();
		HibernateSessionFactory.getSession().close();
	}
	
	public void deleteUser(User user){
		Transaction transaction = HibernateSessionFactory.getSession().beginTransaction();
		userDAO.deleteUser(user);
		transaction.commit();
		HibernateSessionFactory.getSession().close();
	}
}
