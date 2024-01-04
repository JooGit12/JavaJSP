package com.kwon.may085ddp.main;

import java.util.Scanner;

public class ConsoleScreen {
	private Scanner inputSystem;
	
	public ConsoleScreen() {
		inputSystem = new Scanner(System.in);
	}
	
	public Gift getInput() {
		System.out.print("이름 : ");
		String n = inputSystem.next();
		System.out.print("가격 : ");
		int p = inputSystem.nextInt();
		return new Gift(n, p);
	}
	
	public void print(String result) {
		System.out.println(result);
	}
	
	public void bye() {
		inputSystem.close();
	}
}
