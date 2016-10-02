package com.bdqn.hib.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bdqn.hib.pojo.User;

public class Test01 {
	public static void main(String[] args){
		//read the Configuration file
		Configuration config = new Configuration().configure();
		//create SessionFactory
		SessionFactory sessionFactory = config.buildSessionFactory();
		//create Session
		Session session = sessionFactory.openSession();
		//create user
		User user = new User("Amy","111");
		//open Transaction
		Transaction transaction = session.beginTransaction();
		//execute specific actions
		session.save(user);
		//submit Transaction
		transaction.commit();
		session.close();
		//com.mysql.fabric.jdbc.FabricMySQLDriver  -- Wrong url
	}
}
