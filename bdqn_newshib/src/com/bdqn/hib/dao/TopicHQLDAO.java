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
	
	//ɾ�����Ű�飬��Ӧ������ҲҪû�ˣ�Ȼ�����Ŷ�Ӧ������ҲҪû��
	void delete(Topic topic);
	Topic get(Integer id);
}
