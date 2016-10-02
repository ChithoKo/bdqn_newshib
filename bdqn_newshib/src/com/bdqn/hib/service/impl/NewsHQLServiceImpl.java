package com.bdqn.hib.service.impl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hib.dao.NewsHQLDAO;
import com.bdqn.hib.dao.impl.NewsHQLDAOImpl;
import com.bdqn.hib.pojo.News;
import com.bdqn.hib.pojo.Topic;
import com.bdqn.hib.service.NewsHQLService;
import com.bdqn.hib.util.HibernateSessionFactory;

public class NewsHQLServiceImpl implements NewsHQLService{
	
	NewsHQLDAO newsHQLDAO = new NewsHQLDAOImpl();
	
	@Override
	public List<News> getNewsByTid(Topic topic) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		List list=null;
		try{
			list = newsHQLDAO.getNewsByTid(topic);
			tx.commit();
		}catch(RuntimeException e){
			e.printStackTrace();
			tx.rollback();
		}
		return list;
	}
	
	public List<News> getNewsPageByTname(Topic topic, Integer page){
		Transaction tx = HibernateSessionFactory.getSession().beginTransaction();
		List list = newsHQLDAO.getNewsPageByTname(topic, page);
		try{
			tx.commit();
		}catch(RuntimeException e){
			e.printStackTrace();
			tx.rollback();
		}
		
		return list;
	}
	
	
	public static void main(String[] args){
		NewsHQLService ns = new NewsHQLServiceImpl();
		Topic topic = new Topic();
		topic.setTid(1);
		topic.setTname("¹úÄÚ");
		List<News> list = ns.getNewsByTid(topic);
		System.out.println("The size of List: "+list.size());
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getNtitle());
		}
		List<News> listpage = ns.getNewsPageByTname(topic, 4);
		System.out.println("The size of Listpage: "+listpage.size());
		for(int i=0; i<listpage.size(); i++){
			System.out.println(listpage.get(i).getNtitle());
		}
	}
}
