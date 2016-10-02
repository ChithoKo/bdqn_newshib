package com.bdqn.hib.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


import com.bdqn.hib.dao.GenericHQLDAO;
import com.bdqn.hib.util.HibernateSessionFactory;

public class GenericHQLDAOImpl<T extends Serializable, PK extends Serializable> implements GenericHQLDAO<T, PK> {
	private Class<T> entity;
	public Session session;
	public void getSession(){
		this.session = HibernateSessionFactory.getSession();
	}
	
	public GenericHQLDAOImpl(){
		this.entity = null;
		Class c = this.getClass();
		System.out.println("The class of current object: "+c);
		Type t = c.getGenericSuperclass();
		System.out.println("The type of super class of current object: "+t);
		Type[] p = ((ParameterizedType) t).getActualTypeArguments();
		System.out.println("The type of first parameter: "+(Class<T>)p[0]);
		//System.out.println("The size of p: "+p.length);
		
		this.entity = (Class<T>)p[0];
	}
	
	public T get(PK id) {
		this.getSession();
		System.out.println();
		System.out.println();
		return (T)session.get(entity, id);
	}
	
	public List<T> getByName(T t){
		this.getSession();
		Query query = this.session.createQuery("from User u where u.uname=:uname and u.upwd=:upwd");
		query.setProperties(t);
		return query.list();
	}
}
