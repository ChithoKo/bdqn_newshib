package com.bdqn.hib.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.bdqn.hib.dao.UserHQLDAO;
import com.bdqn.hib.pojo.User;
import com.bdqn.hib.util.HibernateSessionFactory;

public class UserHQLDAOImpl extends GenericHQLDAOImpl<User, Integer> implements UserHQLDAO {
	@Override
	public User getUser(Integer id) {
		getSession();
//		String hql = "from User where u.uid=?";
//		Query query = this.session.createQuery(hql);
//		query.setInteger(0, id);
		User user = (User)this.session.get(User.class, id);
		return user;
	}
	
	@Override
	public List<User> getByName(User user) {
		//getSession();
//		String hql = "from User u where u.uname=? and u.upwd=?";
//		Query query = this.session.createQuery(hql);
//		query.setString(0, user.getUname());
//		query.setString(1, user.getUpwd());
		
//		Query query = this.session.createQuery("from User u where u.uname=:uname and u.upwd=:upwd");
//		query.setString("uname", user.getUname());
//		query.setString("upwd", user.getUpwd());
		
//		Query query = this.session.createQuery("from User u where u.uname=:uname and u.upwd=:upwd");
//		query.setProperties(user);
		
		
		return super.getByName(user);
	}
	
	public List<User> getAllUser(){
		//HibernateSessionFactory.getSession();
		getSession();
		//
		String HQL = "from User";
		Query query = session.createQuery(HQL);
		return query.list();
	}

	@Override
	public List<User> getByName(User user, String hql) {
		// TODO Auto-generated method stub
		return null;
	}
}
