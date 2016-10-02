package com.bdqn.hib.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hib.dao.TopicHQLDAO;
import com.bdqn.hib.pojo.Topic;
import com.bdqn.hib.util.HibernateSessionFactory;

public class TopicHQLDAOImpl extends GenericHQLDAOImpl<Topic, Integer> implements TopicHQLDAO{
	public void delete(Topic topic){
		System.out.println("tid: "+topic.getTid());
		Session session = HibernateSessionFactory.getSession();
		session.delete(topic);
		
	}
	
	public Topic get(Integer id){
		Session session = HibernateSessionFactory.getSession();
		Topic topic = (Topic)session.load(Topic.class, id);
		return topic;
	}
}
