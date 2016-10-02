package com.bdqn.hib.dao;

import java.io.Serializable;

public interface GenericDAO<T extends Serializable,PK extends Serializable> {
	public T get(PK id);
}
