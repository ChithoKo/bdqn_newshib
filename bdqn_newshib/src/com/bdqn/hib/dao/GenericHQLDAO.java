package com.bdqn.hib.dao;

import java.io.Serializable;
import java.util.List;

//实现了Serializable的类
//经过反向工程导出来的实体类，都有实现Serializable   T
//包装类：Integer, ...                     PK
public interface GenericHQLDAO<T extends Serializable, PK extends Serializable> {
	T get(PK id);
	List<T> getByName(T t);
}
