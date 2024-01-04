package com.kwon.apr203oe.device;

public class WaterPurifier {
	private String name;
	private int price;
	private boolean iceFire;

	public WaterPurifier() {
		// TODO Auto-generated constructor stub
	}

	public WaterPurifier(String name, int price, boolean iceFire) {
		super();
		this.name = name;
		this.price = price;
		this.iceFire = iceFire;
	}

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

	public boolean isIceFire() {
		return iceFire;
	}

	public void setIceFire(boolean iceFire) {
		this.iceFire = iceFire;
	}

	public void print() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(iceFire);
	}

}
