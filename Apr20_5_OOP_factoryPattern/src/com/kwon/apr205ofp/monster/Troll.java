package com.kwon.apr205ofp.monster;

public class Troll extends Monster {

	Troll() {
		super();
		// TODO Auto-generated constructor stub
	}

	Troll(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		super.attack();
		System.out.println("칼질");
	}
}
