package com.kwon.bnsaabfp.sns;

import java.util.ArrayList;
import java.util.Date;

public class SNSMsg {
	private int no;
	private String owner;
	private String txt;
	private Date date;
	private String color;
	private String ownerPhoto;
	private ArrayList<SNSReply> replys;

	public SNSMsg() {
		// TODO Auto-generated constructor stub
	}

	public SNSMsg(int no, String owner, String txt, Date date, String color, String ownerPhoto,
			ArrayList<SNSReply> replys) {
		super();
		this.no = no;
		this.owner = owner;
		this.txt = txt;
		this.date = date;
		this.color = color;
		this.ownerPhoto = ownerPhoto;
		this.replys = replys;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOwnerPhoto() {
		return ownerPhoto;
	}

	public void setOwnerPhoto(String ownerPhoto) {
		this.ownerPhoto = ownerPhoto;
	}

	public ArrayList<SNSReply> getReplys() {
		return replys;
	}

	public void setReplys(ArrayList<SNSReply> replys) {
		this.replys = replys;
	}

}
