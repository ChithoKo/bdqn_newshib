package com.bdqn.hib.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hib.dao.NewsHQLDAO;
import com.bdqn.hib.pojo.News;
import com.bdqn.hib.pojo.Topic;
import com.bdqn.hib.util.HibernateSessionFactory;

public class NewsHQLDAOImpl extends GenericHQLDAOImpl<News, Integer> implements NewsHQLDAO {

	@Override
	public News get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<News> getByName(News t) {
		// TODO Auto-generated method stub
		return null;
	}

	//�������Ű�飬��ȡ��Ӧ���ţ���ҳ��
	@Override
	public List<News> getNewsPageByTname(Topic topic, Integer page) {
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("FROM News news WHERE news.topic.tname=:tname");
		query.setProperties(topic);
		//�ӵڼ�����ʼ
		query.setFirstResult((page-1)*5);
		//System.out.println((page-1)*5);
		//��ʾ������
		query.setMaxResults(5);
		List list = query.list();
		
		return list;
	}

	public List<News> getNewsByTid(Topic topic){
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("FROM News n WHERE n.topic.tid=:tid");
		query.setProperties(topic);
		List list = query.list();
		
		return list;
	}
	
}
