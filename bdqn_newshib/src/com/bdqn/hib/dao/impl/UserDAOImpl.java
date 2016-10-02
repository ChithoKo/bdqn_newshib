package com.bdqn.hib.dao.impl;
import com.bdqn.hib.dao.*;

import java.io.Serializable;

import org.hibernate.Session;

import com.bdqn.hib.pojo.User;
import com.bdqn.hib.util.HibernateSessionFactory;

public class UserDAOImpl implements UserDAO{
	
	public User getUser(Serializable id){
		//Session session = HibernateSessionFactory.getSession();
		//���Session����ִ��get
		User user = (User)HibernateSessionFactory.getSession().get(User.class, id);
		return user;
	}
	
	public void alterUser(User userNew){
		//���»򱣴� (id==null, insert; id!=null, update)
//		HibernateSessionFactory.getSession().saveOrUpdate(user);
		
		//ͨ��userNew��uid ������ݿ��ڵ�userOri����Ϣ
		//�Ƚ�userNew �� userOri ����Ϣ
		//ֻupdate��ͬ����Ϣ����ʡ�ܶ���Դ������update()������Ҫ�ã��Զ��жϣ� (ǰ��ʱ�������� ��User.xml�ļ��е�<class>������� dynamic-update="true")
		//e.g. <class name="com.bdqn.hib.pojo.User" table="news_users" catalog="newssystem" dynamic-update="true">
//		User userOri = (User)HibernateSessionFactory.getSession().get(User.class, userNew.getUid());
//		userOri.setUname(userNew.getUname());
//		userOri.setUpwd(userNew.getUpwd());
		
		//saveOrUpdateֻ���ж�ʱsave����update���������ж�ֵǰ���Ƿ��б仯 -- 
		//merge�������ж�save����update�������ж��Ƿ�����б�Ҫȥupdate
		HibernateSessionFactory.getSession().merge(userNew);
		
//		HibernateSessionFactory.getSession().update(user);
	}
	
	public void deleteUser(User user){
		//ͨ��user�� uid�ҵ����ݿ�Ķ�Ӧ��user��Ϣ�������ݿ��е���Ϣȫ����ֵ��userNew�У�Ȼ����ɾ��userNew
		//�������ĺô��� ��Ϊuser�ĸ�������Ϊnot-null����������Լ�����һ��user����ҪΪÿһ�����Ը�ֵ
		//��userNew�ķ������ͽ�ʡΪ�������Ը�ֵ�Ĵ��룬ֱ�Ӹ�ֵuid���Ϳ����ù�get������������������Ե���Ϣ
		User userNew = (User)HibernateSessionFactory.getSession().get(User.class, user.getUid());
		HibernateSessionFactory.getSession().delete(userNew);
	}
}
