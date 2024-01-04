package com.kwon.apr201opi.product;

public class Scanner extends Product {
	boolean fax;

	public Scanner() {
		// TODO Auto-generated constructor stub
	}

	public Scanner(String name, int price, boolean fax) {
		super(name, price);
		this.fax = fax;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(fax);
	}
}
