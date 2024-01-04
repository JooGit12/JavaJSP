package com.kwon.may085ddp.main;

public class HomeController {
	public static void main(String[] args) {
		ConsoleScreen cs = new ConsoleScreen();
		Gift g = cs.getInput();
		String result = GiftDAO.reg(g);
		cs.print(result);
		cs.bye();
	}
}






