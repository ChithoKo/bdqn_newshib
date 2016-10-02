package com.bdqn.hib.test;

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hib.pojo.Comments;
import com.bdqn.hib.pojo.News;
import com.bdqn.hib.util.HibernateSessionFactory;

public class Testh {
	public static void main(String[] args){
		Transaction tx = null;
		Session session = null;
		
		try{
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
//			News news = (News) session.get(News.class, 80);
//		
//		
//			tx.commit();
//		
//			System.out.println("News title: " + news.getNtitle());
//			
//			Set<Comments> set = news.getCommentses();
//			
//			for(Comments comment : set){
//				System.out.println(comment.getCcontent());
//			}
			
			Query query = session.createQuery("from News");
			query.setCacheable(true);
			List<News> list = query.list();
			
			tx.commit();
			
			for(int i=0; i<list.size(); i++){
				System.out.println("News: "+list.get(i).getNtitle());
				Set<Comments> set = list.get(i).getCommentses();
				if(set.size()>0){
					System.out.println("\tComments: ");
					for(Comments c:set){
						System.out.println("\t\t"+c.getCcontent());
					}
				}
			}
		}catch(RuntimeException e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		try{
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
//			News news = (News) session.get(News.class, 80);
//		
//		
//			tx.commit();
//		
//			System.out.println("News title: " + news.getNtitle());
//			
//			Set<Comments> set = news.getCommentses();
//			
//			for(Comments comment : set){
//				System.out.println(comment.getCcontent());
//			}
			
			Query query = session.createQuery("from News");
			query.setCacheable(true);
			List<News> list = query.list();
			
			tx.commit();
			
			for(int i=0; i<list.size(); i++){
				System.out.println("News: "+list.get(i).getNtitle());
				Set<Comments> set = list.get(i).getCommentses();
				if(set.size()>0){
					System.out.println("\tComments: ");
					for(Comments c:set){
						System.out.println("\t\t"+c.getCcontent());
					}
				}
			}
		}catch(RuntimeException e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
		}
	}
	
}
