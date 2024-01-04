package com.kwon.apr205ofp.monster;

public class Monster {
	private int x;
	private int y;

	Monster() {
		// TODO Auto-generated constructor stub
	}

	Monster(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void attack() {
		System.out.printf("%d, %d에서 ", x, y);
	}
}
