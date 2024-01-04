package com.kwon.apr211oa.avengers;

// abstract

// Avengers : 실체가 없는 추상적인 개념일 뿐

// abstract 클래스 : 객체를 못만드는 클래스
//		abstract메소드를 하나라도 갖고 있으면

// abstract 메소드 : 미구현된 메소드
//		하위클래스에서 반드시 오버라이딩해야

public abstract class Avengers {
	private String name;
	private int age;
	
	public Avengers() {
		// TODO Auto-generated constructor stub
	}
	public Avengers(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void attack();
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(age);
	}
	
}






