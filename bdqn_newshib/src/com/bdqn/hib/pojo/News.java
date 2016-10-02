package com.bdqn.hib.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * News entity. @author MyEclipse Persistence Tools
 */

public class News implements java.io.Serializable {

	// Fields

	private Integer nid;
	private Topic topic;
	private String ntitle;
	private String nauthor;
	private Timestamp ncreatedate;
	private String npicpath;
	private String ncontent;
	private Timestamp nmodifydate;
	private String nsummary;
	private Set commentses = new HashSet(0);

	// Constructors

	/** default constructor */
	public News() {
	}

	/** minimal constructor */
	public News(Topic topic, String ntitle, String nauthor, String ncontent,
			String nsummary) {
		this.topic = topic;
		this.ntitle = ntitle;
		this.nauthor = nauthor;
		this.ncontent = ncontent;
		this.nsummary = nsummary;
	}

	/** full constructor */
	public News(Topic topic, String ntitle, String nauthor,
			Timestamp ncreatedate, String npicpath, String ncontent,
			Timestamp nmodifydate, String nsummary, Set commentses) {
		this.topic = topic;
		this.ntitle = ntitle;
		this.nauthor = nauthor;
		this.ncreatedate = ncreatedate;
		this.npicpath = npicpath;
		this.ncontent = ncontent;
		this.nmodifydate = nmodifydate;
		this.nsummary = nsummary;
		this.commentses = commentses;
	}

	// Property accessors

	public Integer getNid() {
		return this.nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public Topic getTopic() {
		return this.topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public String getNtitle() {
		return this.ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNauthor() {
		return this.nauthor;
	}

	public void setNauthor(String nauthor) {
		this.nauthor = nauthor;
	}

	public Timestamp getNcreatedate() {
		return this.ncreatedate;
	}

	public void setNcreatedate(Timestamp ncreatedate) {
		this.ncreatedate = ncreatedate;
	}

	public String getNpicpath() {
		return this.npicpath;
	}

	public void setNpicpath(String npicpath) {
		this.npicpath = npicpath;
	}

	public String getNcontent() {
		return this.ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	public Timestamp getNmodifydate() {
		return this.nmodifydate;
	}

	public void setNmodifydate(Timestamp nmodifydate) {
		this.nmodifydate = nmodifydate;
	}

	public String getNsummary() {
		return this.nsummary;
	}

	public void setNsummary(String nsummary) {
		this.nsummary = nsummary;
	}

	public Set getCommentses() {
		return this.commentses;
	}

	public void setCommentses(Set commentses) {
		this.commentses = commentses;
	}

}