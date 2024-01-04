package com.kwon.apr202oam.main;

import com.kwon.apr202oam.item.Mouse;

// Mouse, Tester
//		같은패키지x
//		상속관계o
public class Tester2 extends Mouse {
	public void test() {
		Mouse m = new Mouse();
		m.name = "로지텍123";
		m.price = 10000; // ???
		m.maker = "로지텍";
		m.dpi = 8000;
	}
}
