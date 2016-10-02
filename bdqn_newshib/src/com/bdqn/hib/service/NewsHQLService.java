package com.bdqn.hib.service;

import java.util.List;

import com.bdqn.hib.pojo.News;
import com.bdqn.hib.pojo.Topic;


public interface NewsHQLService {
//	List<News> printTopics(String topicName);
//	List<News> getNewsByPageNum(int pageNum, int pageSize);
//	int getPageNumMax(int pageSize);
//	List<News> getNewsByTopic(int pageNum, int pageSize, int ntid);
//	int getPageNumMax(int pageSize, int ntid);
//	News getNews(int nid);
//	List<News> getAllNews();
//	void deleteNews(int nid);
//	void addNews(int nTid, String nTitle, String nAuthor, String nSummary, String nContent);
//	void editNews(int nid, News news);
	
	List<News> getNewsByTid(Topic topic);
	List<News> getNewsPageByTname(Topic topic, Integer page);
}
