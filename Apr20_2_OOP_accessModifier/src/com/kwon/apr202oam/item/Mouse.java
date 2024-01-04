package com.kwon.apr202oam.item;

// access modifier(접근제어자, 접근지정자, ...)
// 멤버들 외부에서 접근여부
//		public				: 다
//		protected			: 같은패키지 or 다른패키지지만 상속관계
//		(default, friendly) : 같은패키지
//		private				: 외부에서 접근 불가

// protected가 사실상 default랑 같게 작동함...
public class Mouse {
	public String name;
	protected int price;
	String maker;
	private int dpi;
	
	public Mouse() {
		// TODO Auto-generated constructor stub
	}

	public Mouse(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void show() {
		System.out.println(name);
		System.out.println(price);
	}
}
