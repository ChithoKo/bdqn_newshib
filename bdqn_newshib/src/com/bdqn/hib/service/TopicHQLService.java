package com.bdqn.hib.service;

import java.util.List;

import com.bdqn.hib.pojo.News;
import com.bdqn.hib.pojo.Topic;


public interface TopicHQLService {
//	void addTopic(String tName);
//	void editTopic(String tName, String tNameOri);
//	void deleteTopic(String tName);
//	int getTopicID(String tName);
//	List<Topic> getTopics();
//	List<News> getNewsByTopic(String tName);
	
	void delete(Topic topic);
	Topic get(Integer id);
}
