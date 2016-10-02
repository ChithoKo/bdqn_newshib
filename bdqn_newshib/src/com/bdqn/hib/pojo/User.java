package com.bdqn.hib.pojo;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String uname, String upwd) {
		super(uname, upwd);
	}

}
