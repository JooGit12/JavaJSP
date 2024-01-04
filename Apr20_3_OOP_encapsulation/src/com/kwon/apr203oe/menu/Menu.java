package com.kwon.apr203oe.menu;

public class Menu {
	// 1. 멤버변수
	private String name;
	private int price;
	private boolean soldOut;

	// 2. 생성자시리즈
	// 2-1. 기본 생성자(ctrl + space)
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	// 2-2. 오버로딩된 생성자(ctrl + shift + a)
	public Menu(String name, int price, boolean soldOut) {
		super();
		this.name = name;
		this.price = price;
		this.soldOut = soldOut;
	}

	// 3. getter, setter(ctrl + shift + s)
	// 외부에서 접근할 필요가 있는것만
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isSoldOut() {
		return soldOut;
	}

	public void setSoldOut(boolean soldOut) {
		this.soldOut = soldOut;
	}
	
	// 4. 기타 메소드
	public void print() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(soldOut);
	}
}