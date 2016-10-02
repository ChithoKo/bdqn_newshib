package com.bdqn.hib.test;

import org.hibernate.Transaction;

import com.bdqn.hib.pojo.User;
import com.bdqn.hib.util.HibernateSessionFactory;

public class Test02 {
	public static void main(String[] args){
		Transaction transaction = HibernateSessionFactory.getSession().beginTransaction();
		
		User user = new User();
		user.setUid(3);
		user.setUname("Bert");
		user.setUpwd("000");
		
		HibernateSessionFactory.getSession().save(user);
		
		transaction.commit();
		
		HibernateSessionFactory.getSession().close();
	}
}
