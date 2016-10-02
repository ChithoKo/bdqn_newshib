package com.bdqn.hib.dao;

import java.util.List;

import com.bdqn.hib.pojo.Comments;

public interface CommentsHQLDAO {
	List<Comments> getComments(int cnid);
	void deleteComments(int cnid);
	void addComments(Comments comment);
	void editComments(Comments comment, int cid);
}
