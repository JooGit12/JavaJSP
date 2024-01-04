package com.kwon.apr205ofp.main;

import com.kwon.apr205ofp.monster.Monster;
import com.kwon.apr205ofp.monster.Summoner;

public class OMain2 {
	public static void main(String[] args) throws InterruptedException {
		Summoner s = new Summoner();
		Monster m;
		for (int i = 0; i < 10; i++) {
			m = s.summon();
			m.attack();
			Thread.sleep(1000);
		}
	}
}
