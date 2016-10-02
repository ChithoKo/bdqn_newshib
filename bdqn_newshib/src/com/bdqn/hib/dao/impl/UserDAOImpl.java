package com.bdqn.hib.dao.impl;
import com.bdqn.hib.dao.*;

import java.io.Serializable;

import org.hibernate.Session;

import com.bdqn.hib.pojo.User;
import com.bdqn.hib.util.HibernateSessionFactory;

public class UserDAOImpl implements UserDAO{
	
	public User getUser(Serializable id){
		//Session session = HibernateSessionFactory.getSession();
		//获得Session，并执行get
		User user = (User)HibernateSessionFactory.getSession().get(User.class, id);
		return user;
	}
	
	public void alterUser(User userNew){
		//更新或保存 (id==null, insert; id!=null, update)
//		HibernateSessionFactory.getSession().saveOrUpdate(user);
		
		//通过userNew的uid 获得数据库内的userOri的信息
		//比较userNew 和 userOri 的信息
		//只update不同的信息（节省很多资源）（连update()都不需要用，自动判断） (前提时！！！： 在User.xml文件中的<class>里面加入 dynamic-update="true")
		//e.g. <class name="com.bdqn.hib.pojo.User" table="news_users" catalog="newssystem" dynamic-update="true">
//		User userOri = (User)HibernateSessionFactory.getSession().get(User.class, userNew.getUid());
//		userOri.setUname(userNew.getUname());
//		userOri.setUpwd(userNew.getUpwd());
		
		//saveOrUpdate只会判断时save还是update，但不会判断值前后是否有变化 -- 
		//merge不仅会判断save还是update，还会判断是否真的有必要去update
		HibernateSessionFactory.getSession().merge(userNew);
		
//		HibernateSessionFactory.getSession().update(user);
	}
	
	public void deleteUser(User user){
		//通过user的 uid找到数据库的对应的user信息，将数据库中的信息全部赋值到userNew中，然后再删除userNew
		//这样做的好处： 因为user的各种属性为not-null，所以如果自己创建一个user，就要为每一个属性赋值
		//用userNew的方法，就节省为各种属性赋值的代码，直接赋值uid，就可以用过get方法获得所有其他属性的信息
		User userNew = (User)HibernateSessionFactory.getSession().get(User.class, user.getUid());
		HibernateSessionFactory.getSession().delete(userNew);
	}
}
