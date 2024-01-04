package com.kwon.apr244ucio.student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	private String name;
	private Date birthday;
	private int kor;
	private int eng;
	private int mat;
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd(E)");

	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String line) throws ParseException {
		String[] line2 = line.split(",");
		name = line2[0];
		birthday = sdf.parse(line2[1]);
		kor = Integer.parseInt(line2[2]);
		eng = Integer.parseInt(line2[3]);
		mat = Integer.parseInt(line2[4]);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}

	public void printInfo() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("생일 : %s\n", sdf2.format(birthday));
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", mat);
		double avg = (kor + eng + mat) / 3.0;
		System.out.printf("평균 : %.1f\n", avg);
		System.out.println("-----");
	}
	
}






