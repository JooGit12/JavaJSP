package com.kwon.apr203oe.main;

import com.kwon.apr203oe.device.WaterPurifier;
import com.kwon.apr203oe.menu.Menu;
import com.kwon.apr203oe.menu.Sool;

// 식당
public class OMain2 {
	public static void main(String[] args) {
		Menu m = new Menu("제육덮밥", 6000, false);
		// m.price = 7000;
		m.setPrice(7000); 
		// System.out.println(m.name);
		System.out.println(m.getName());
		System.out.println(m.isSoldOut());
		m.print();
		System.out.println("-----");
		
		WaterPurifier wp = new WaterPurifier("위니아123", 500000, true);
		wp.print();
		System.out.println("-----");
		
		Sool s = new Sool("처음처럼", 4000, false, 12);
		s.print();
	}
}


