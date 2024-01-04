package com.kwon.apr203oe.human;

// public, protected/안쓰는거, private

// Java에서 패키지정리하는게 주제별로
// -> main이랑 JavaBean은 패키지가 나뉠것
// -> 어차피 사용하려고 만든 멤버들
// -> public을 쓰

// public을 줘서 외부에서 직접 건들게해놓으면 
// -> 잘못된 데이터가 들어갈 수 있어서 위험
// -> 캡슐화

// encapsulation(캡슐화)
//		OOP하는 이유 중 하나
//		데이터를 안전하게 다룰 수 있음

// 1) 멤버변수에 private먹여서 외부 접근 막음
// 2) 멤버변수를 건들 수 있는 통로(getter,setter) 제작
// 3) 그 통로에 안전장치를
public class Human {
	private String name;
	private int age;

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
		if (age < 0) {
			age *= -1;
		}
		this.age = age;
	}

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void showInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}
