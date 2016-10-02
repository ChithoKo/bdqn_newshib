package com.bdqn.hib.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.hibernate.Session;

import com.bdqn.hib.dao.GenericDAO;
import com.bdqn.hib.util.HibernateSessionFactory;

public class GenericDAOImpl<T extends Serializable,PK extends Serializable> implements GenericDAO<T, PK> {
	private Class<T> entity;
	//private Session session;
	public Session session;
	public void getSession(){
		session=HibernateSessionFactory.getSession();
	}
	
	public GenericDAOImpl(){
		this.entity=null;
		Class c=this.getClass();
		System.out.println(c);
		Type t=c.getGenericSuperclass();
		System.out.println(t);
		Type[] p=((ParameterizedType) t).getActualTypeArguments();
		System.out.println((Class<T>)p[0]);
		
		this.entity=(Class<T>)p[0];
	}
	@Override
	public T get(PK id) {
		// TODO Auto-generated method stub
		this.getSession();
		System.out.println(entity);
		System.out.println(id);
		return (T) session.get(entity, id);
	}
	//����
	public void save(T entity){
		
	}
	//�޸�
	public void update(T entity){
		
	}
	//ɾ��
	
}
