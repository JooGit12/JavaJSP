package com.kwon.apr284ucc.subway;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SubwayStationInfo {
	private Date when;
	private String no;
	private String name;
	private int ride;
	private int alight;
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd(E)");
	
 	public SubwayStationInfo() {
		// TODO Auto-generated constructor stub
	}

	public SubwayStationInfo(String line) throws ParseException {
		String[] line2 = line.split(",");
		String when2 = line2[0] + line2[1] + line2[2]; // 20150102
		when = sdf.parse(when2);
		no = line2[3];
		name = line2[4];
		ride = Integer.parseInt(line2[5]);
		alight = Integer.parseInt(line2[6]);
	}

	public void printInfo() {
		System.out.println(sdf2.format(when));
		System.out.println(no);
		System.out.println(name);
		System.out.println(ride);
		System.out.println(alight);
		System.out.println("-----");
	}
	
	public Date getWhen() {
		return when;
	}

	public void setWhen(Date when) {
		this.when = when;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRide() {
		return ride;
	}

	public void setRide(int ride) {
		this.ride = ride;
	}

	public int getAlight() {
		return alight;
	}

	public void setAlight(int alight) {
		this.alight = alight;
	}

}
