package com.bdqn.hib.dao;

import java.util.List;

import com.bdqn.hib.pojo.News;
import com.bdqn.hib.pojo.Topic;


public interface NewsHQLDAO extends GenericHQLDAO<News, Integer>{
//	List<News> getTopics(String topicName);
//	int chooseTopicName(String name);
//	List<News> getNewsByPageNum(int pageNum, int pageSize);
//	int getPageNumMax(int pageSize);
//	List<News> getNewsByTopic(int pageNum, int pageSize, int ntid);
//	int getPageNumMax(int pageSize, int ntid);
//	void deleteNews(int nid);
//	void editNews(int nid, News news);
//	News getNews(int nid);
//	List<News> getAllNews();
//	void addNews(int nTid, String nTitle, String nAuthor, String nSummary, String nContent);

	List<News> getNewsPageByTname(Topic topic, Integer page);
	List<News> getNewsByTid(Topic topic);
}
