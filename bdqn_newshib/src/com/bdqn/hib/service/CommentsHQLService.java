package com.bdqn.hib.service;

import java.util.List;

import com.bdqn.hib.pojo.Comments;


public interface CommentsHQLService {
	List<Comments> getComments(int cnid);
	void deleteComments(int cnid);
	void addComments(Comments comment);
	void editComments(Comments comment, int cid);
}
