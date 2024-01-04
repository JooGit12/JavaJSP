package com.kwon.may091jl.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.kwon.may091jl.menu.Menu;
import com.kwon.may091jl.restaurant.Restaurant;

public class ConsoleScr {
	private Scanner inputSystem;

	public ConsoleScr() {
		inputSystem = new Scanner(System.in);
	}

	public int showMainMenu() {
		System.out.println("1) 식당등록");
		System.out.println("2) 메뉴등록");
		System.out.println("3) 식당조회");
		System.out.println("4) 메뉴조회");
		System.out.println("...");
		System.out.println("10) 종료");
		System.out.println("-----");
		System.out.print("뭐 : ");
		return inputSystem.nextInt();
	}

	public int showGetPageNoMenu(int pageCount) {
		System.out.print("페이지(1 ~ " + pageCount + ") : ");
		return inputSystem.nextInt();
	}
	
	public Restaurant showRegRestaurantMenu() {
		System.out.print("이름 : ");
		String n = inputSystem.next();

		System.out.print("시작일 : ");
		String s = inputSystem.next();

		System.out.print("주소 : ");
		String a = inputSystem.next();

		return new Restaurant(n, null, a, s);
	}

	public Menu showRegMenuMenu() {
		System.out.print("메뉴명 : ");
		String n = inputSystem.next();
		
		System.out.print("가격 : ");
		int p = inputSystem.nextInt();
		
		System.out.print("판매식당명 : ");
		String rn = inputSystem.next();
		
		return new Menu(0, n, p, rn);
	}
	
	public void printResult(String result) {
		System.out.println(result);
		System.out.println("-----");
	}

	public void printMenus(ArrayList<Menu> menus) {
		for (Menu menu : menus) {
			System.out.println(menu.getNo());
			System.out.println(menu.getName());
			System.out.println(menu.getPrice());
			System.out.println(menu.getRestaurantName());
			System.out.println("-----");
		}
	}
	
	public void printRestaurants(ArrayList<Restaurant> restaurants) {
		for (Restaurant restaurant : restaurants) {
			System.out.println(restaurant.getName());
			System.out.println(restaurant.getStart());
			System.out.println(restaurant.getAddr());
			System.out.println("-----");
		}
	}
	
	public void bye() {
		inputSystem.close();
	}
}
