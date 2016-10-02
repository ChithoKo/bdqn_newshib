package com.bdqn.hib.dao;

import java.util.List;

import com.bdqn.hib.pojo.News;
import com.bdqn.hib.pojo.Topic;


public interface TopicHQLDAO extends GenericHQLDAO<Topic, Integer>{
//	void addTopic(String tName);
//	void editTopic(String tName, String tNameOri);
//	void deleteTopic(String tName);
//	int getTopicID(String tName);
//	List<Topic> getTopics();
//	List<News> getNewsByTopic(String tName);
	
	//删除新闻板块，对应的新闻也要没了，然后新闻对应的评论也要没了
	void delete(Topic topic);
	Topic get(Integer id);
}
