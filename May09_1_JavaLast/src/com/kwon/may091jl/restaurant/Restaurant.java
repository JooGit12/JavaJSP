package com.kwon.may091jl.restaurant;

import java.util.Date;

public class Restaurant {
	private String name;
	private Date start;
	private String addr;
	private String start2;

	public Restaurant() {
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String name, Date start, String addr, String start2) {
		super();
		this.name = name;
		this.start = start;
		this.addr = addr;
		this.start2 = start2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getStart2() {
		return start2;
	}

	public void setStart2(String start2) {
		this.start2 = start2;
	}

}
