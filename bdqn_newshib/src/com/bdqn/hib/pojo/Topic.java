package com.bdqn.hib.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Topic entity. @author MyEclipse Persistence Tools
 */

public class Topic implements java.io.Serializable {

	// Fields

	private Integer tid;
	private String tname;
	private Set newses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Topic() {
	}

	/** minimal constructor */
	public Topic(String tname) {
		this.tname = tname;
	}

	/** full constructor */
	public Topic(String tname, Set newses) {
		this.tname = tname;
		this.newses = newses;
	}

	// Property accessors

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Set getNewses() {
		return this.newses;
	}

	public void setNewses(Set newses) {
		this.newses = newses;
	}

}