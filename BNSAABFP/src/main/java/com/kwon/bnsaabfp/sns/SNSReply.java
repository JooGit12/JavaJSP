package com.kwon.bnsaabfp.sns;

import java.util.Date;

public class SNSReply {
	private int no;
	private String owner;
	private String txt;
	private Date date;
	private int s_no;

	public SNSReply() {
		// TODO Auto-generated constructor stub
	}

	public SNSReply(int no, String owner, String txt, Date date, int s_no) {
		super();
		this.no = no;
		this.owner = owner;
		this.txt = txt;
		this.date = date;
		this.s_no = s_no;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getS_no() {
		return s_no;
	}

	public void setS_no(int s_no) {
		this.s_no = s_no;
	}

}
