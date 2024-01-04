package com.kwon.apr214os.human;

import com.kwon.apr214os.hero.Hero;
import com.kwon.apr214os.hero.Ironman;

public class Human {
	private String name;
	private Hero hero;

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void jjim(Hero h) {
		hero = h;
	}
	
	public void helpMe() {
		hero.attack();
	}
}
