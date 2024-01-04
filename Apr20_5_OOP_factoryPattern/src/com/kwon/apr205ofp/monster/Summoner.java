package com.kwon.apr205ofp.monster;

import java.util.Random;

public class Summoner {
	private Random brain;

	public Summoner() {
		brain = new Random();
	}

	public Monster summon() {
		int what = brain.nextInt(3);
		int x = brain.nextInt(100);
		int y = brain.nextInt(100);

		if (what == 0) {
			return new Orc(x, y);
		} else if (what == 1) {
			return new Troll(x, y);
		}
		return new Skeleton(x, y);
	}
}
