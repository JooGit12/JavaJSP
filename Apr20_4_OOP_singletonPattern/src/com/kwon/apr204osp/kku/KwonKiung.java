package com.kwon.apr204osp.kku;

// 객체를 하나만 만들어서 쓰게
// => singleton패턴
public class KwonKiung {
	private String name;
	private String home;
	// 2) 내부에서 객체 하나 만들어서 못바꾸게
	private static final KwonKiung KKU = new KwonKiung("권기웅", "분당");

	// 1) 생성자시리즈 private -> 외부에서 객체 못만들게
	private KwonKiung() {
		// TODO Auto-generated constructor stub
	}
	private KwonKiung(String name, String home) {
		super();
		this.name = name;
		this.home = home;
	}

	// 3) 2)에서 만든거 외부에서 사용할 수 있게
	public static KwonKiung getKku() {
		return KKU;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public void introduce() {
		System.out.println(name);
		System.out.println(home);
	}
}
