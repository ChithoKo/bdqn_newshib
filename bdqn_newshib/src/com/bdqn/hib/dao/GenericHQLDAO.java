package com.bdqn.hib.dao;

import java.io.Serializable;
import java.util.List;

//ʵ����Serializable����
//�������򹤳̵�������ʵ���࣬����ʵ��Serializable   T
//��װ�ࣺInteger, ...                     PK
public interface GenericHQLDAO<T extends Serializable, PK extends Serializable> {
	T get(PK id);
	List<T> getByName(T t);
}
