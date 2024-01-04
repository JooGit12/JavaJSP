package com.kwon.apr205ofp.monster;

public class Orc extends Monster {
	Orc() {
		super();
	}

	Orc(int x, int y) {
		super(x, y);
	}

	@Override
	public void attack() {
		super.attack();
		System.out.println("주먹질");
	}
}
