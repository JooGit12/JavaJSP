package com.kwon.may085ddp.main;

// DTO
public class Gift {
	private String name; 
	private int price; 
	
	public Gift() {
		// TODO Auto-generated constructor stub
	}

	public Gift(String name, int price) {
		super();
		this.name = name;
		this.price = price;
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
	
	
}
