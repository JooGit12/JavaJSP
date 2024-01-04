package com.kwon.apr205ofp.monster;

public class Skeleton extends Monster {

	Skeleton() {
		super();
		// TODO Auto-generated constructor stub
	}

	Skeleton(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		super.attack();
		System.out.println("화살");
	}
}
