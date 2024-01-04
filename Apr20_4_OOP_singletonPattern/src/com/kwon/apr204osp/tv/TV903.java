package com.kwon.apr204osp.tv;

// 멤버변수 
// 	없다 -> 객체는 필요없음 : static메소드 기반
// 	있다 -> 객체가 필요하기는 함
//		only one : singleton패턴
//		여러개 : 평소대로
public class TV903 {
	private String name;
	private String maker;
	private static final TV903 TV 
		= new TV903("AVA1000-08-1", "ESTLA");

	private TV903() {
		// TODO Auto-generated constructor stub
	}

	private TV903(String name, String maker) {
		super();
		this.name = name;
		this.maker = maker;
	}

	// getInstance라는 이름을 쓰기도
	public static TV903 getTv() {
		return TV;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public void showInfo() {
		System.out.println(name);
		System.out.println(maker);
	}
}
