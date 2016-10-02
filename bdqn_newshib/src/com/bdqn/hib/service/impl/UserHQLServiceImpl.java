package com.bdqn.hib.service.impl;

import java.util.List;

import org.hibernate.Transaction;

import com.bdqn.hib.dao.UserHQLDAO;
import com.bdqn.hib.dao.impl.UserHQLDAOImpl;
import com.bdqn.hib.pojo.User;
import com.bdqn.hib.service.UserHQLService;
import com.bdqn.hib.util.HibernateSessionFactory;

public class UserHQLServiceImpl implements UserHQLService{
	
	UserHQLDAO uhd = new UserHQLDAOImpl();
	
	@Override
	public List<User> getUserByName(User user) {
		Transaction tran = HibernateSessionFactory.getSession().beginTransaction();
		List<User> lu = null;
		
		try{
			lu = uhd.getByName(user);
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
		}
		return lu;
	}
	
@Override
public List<User> getAllUser() {
	Transaction transaction = HibernateSessionFactory.getSession().beginTransaction();
	List<User> lu = null;
	try{
		lu = uhd.getAllUser();
		transaction.commit();
	}catch(Exception e){
		e.printStackTrace();
		transaction.rollback();
	}
	return lu;
}

	public static void main(String[] args){
		UserHQLService uhs = new UserHQLServiceImpl();
		System.out.println(uhs.getAllUser().size());
		User user = new User();
		user.setUid(2);
		user.setUname("Bert");
		user.setUpwd("000");
		System.out.println(uhs.getUserByName(user).size());
	}
}
