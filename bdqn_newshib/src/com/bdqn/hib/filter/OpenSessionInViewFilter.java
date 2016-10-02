package com.bdqn.hib.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hib.util.HibernateSessionFactory;

public class OpenSessionInViewFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("doFilter() : OpenSessionInView");
		Session session = null;
		Transaction transaction = null;
		try{
			session = HibernateSessionFactory.getSession();
			transaction = session.beginTransaction();
			chain.doFilter(request, response);
			transaction.commit();
			
		}catch(RuntimeException e){
			e.printStackTrace();
			if(transaction!=null){
				transaction.rollback();
			}
		}finally{
			session.close();
		}
		
		
		
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

}
