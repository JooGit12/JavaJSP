package com.kwon.apr206op.avengers;

public class Ironman extends Avengers {
	private String aiName;

	public Ironman() {
		// TODO Auto-generated constructor stub
	}

	public Ironman(String name, int age, String aiName) {
		super(name, age);
		this.aiName = aiName;
	}

	public String getAiName() {
		return aiName;
	}

	public void setAiName(String aiName) {
		this.aiName = aiName;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(aiName);
	}

}
