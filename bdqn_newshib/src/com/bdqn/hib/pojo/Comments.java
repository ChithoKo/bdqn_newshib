package com.bdqn.hib.pojo;

import java.sql.Timestamp;

/**
 * Comments entity. @author MyEclipse Persistence Tools
 */

public class Comments implements java.io.Serializable {

	// Fields

	private Integer cid;
	private News news;
	private String ccontent;
	private Timestamp cdate;
	private String cip;
	private String cauthor;

	// Constructors

	/** default constructor */
	public Comments() {
	}

	/** full constructor */
	public Comments(News news, String ccontent, Timestamp cdate, String cip,
			String cauthor) {
		this.news = news;
		this.ccontent = ccontent;
		this.cdate = cdate;
		this.cip = cip;
		this.cauthor = cauthor;
	}

	// Property accessors

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public News getNews() {
		return this.news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public String getCcontent() {
		return this.ccontent;
	}

	public void setCcontent(String ccontent) {
		this.ccontent = ccontent;
	}

	public Timestamp getCdate() {
		return this.cdate;
	}

	public void setCdate(Timestamp cdate) {
		this.cdate = cdate;
	}

	public String getCip() {
		return this.cip;
	}

	public void setCip(String cip) {
		this.cip = cip;
	}

	public String getCauthor() {
		return this.cauthor;
	}

	public void setCauthor(String cauthor) {
		this.cauthor = cauthor;
	}

}