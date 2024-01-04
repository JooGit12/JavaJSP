package com.kwon.apr203oe.menu;

public class Sool extends Menu {
	private double alcohol;
	
	public Sool() {
		// private걸린거는 상속 안된다? - x
		// 접근제어자 판정기준 : Menu
		// 어쨌든 Sool은 Menu의 외부
		// System.out.println(name);
		System.out.println(getName());
		// price = 5000; 
		setPrice(5000);
		// TODO Auto-generated constructor stub
	}

	public Sool(String name, int price, boolean soldOut, double alcohol) {
		super(name, price, soldOut);
		this.alcohol = alcohol;
	}

	public double getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(alcohol);
	}
}
