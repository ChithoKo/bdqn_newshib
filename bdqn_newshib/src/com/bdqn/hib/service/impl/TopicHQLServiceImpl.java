package com.bdqn.hib.service.impl;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Transaction;

import com.bdqn.hib.dao.TopicHQLDAO;
import com.bdqn.hib.dao.impl.TopicHQLDAOImpl;
import com.bdqn.hib.pojo.News;
import com.bdqn.hib.pojo.Topic;
import com.bdqn.hib.service.TopicHQLService;
import com.bdqn.hib.util.HibernateSessionFactory;

public class TopicHQLServiceImpl implements TopicHQLService{
	
	TopicHQLDAO thd = new TopicHQLDAOImpl();
	
	public void delete(Topic topic){
		Transaction tx = HibernateSessionFactory.getSession().beginTransaction();
		Topic topicNew = thd.get(topic.getTid());
		System.out.println("Topic: "+topicNew.getTname());
		try{
			thd.delete(topicNew);
			tx.commit();
		}catch(RuntimeException e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			HibernateSessionFactory.getSession().close();
		}
	}

	public Topic get(Integer id){
		//Transaction tx = HibernateSessionFactory.getSession().beginTransaction();
		Topic topic=null;
//		try{
//			topic = thd.get(id);
//			//tx.commit();
//		}catch(RuntimeException e){
//			e.printStackTrace();
//			//tx.rollback();
//		}finally{
//			//HibernateSessionFactory.getSession().close();
//		}
//		return topic;
		topic = thd.get(id);
		return topic;
	}
	
	
	public static void main(String[] args){
//		Topic topic = new Topic();
//		topic.setTid(34);
//		TopicHQLService ths = new TopicHQLServiceImpl();
//		ths.delete(topic);
		
		TopicHQLService ths = new TopicHQLServiceImpl();
		System.out.println("Before get() : ");
		Topic topic = ths.get(1);
		System.out.println("Right after get() : topic : "+topic.getTname());
		Set set = topic.getNewses();
		System.out.println("Size of topic : "+set.size());
		
		Iterator<News> iterator = set.iterator();
		while(iterator.hasNext()){
			News news = iterator.next();
			System.out.println(news.getNtitle());
		}
	}
}
