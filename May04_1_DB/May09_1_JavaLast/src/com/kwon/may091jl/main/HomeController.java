package com.kwon.may091jl.main;

import java.util.ArrayList;

import com.kwon.may091jl.menu.Menu;
import com.kwon.may091jl.menu.MenuDAO;
import com.kwon.may091jl.restaurant.Restaurant;
import com.kwon.may091jl.restaurant.RestaurantDAO;

// 웹사이트 : 동시에 여러명이
// 		DB계정 하나를 같이 쓰게 되는거
//		계정 하나당 동시에 접속할 수 있는 수 제한되어있고
//		=> 작업 하나 해야할 때마다 연결해서 처리하고 바로 끊어야
public class HomeController {
	public static void main(String[] args) {
		MenuDAO.getMdao().setAllMenuCount();
		RestaurantDAO.getRdao().setAllRestaurantCount();
		
		ConsoleScr cs = new ConsoleScr();
		Restaurant r = null;
		Menu m = null;
		String result = null;
		int menu = 0;
		ArrayList<Menu> menus = null;
		ArrayList<Restaurant> restaurants = null;
		int pageCount = 0;
		int pageNo = 0;
		while (true) {
			menu = cs.showMainMenu();
			if (menu == 10) {
				break;
			} else if (menu == 1) {
				r = cs.showRegRestaurantMenu();
				result = RestaurantDAO.getRdao().reg(r);
				cs.printResult(result);
			} else if (menu == 2) {
				pageCount = RestaurantDAO.getRdao().getAllPageCount();
				pageNo = cs.showGetPageNoMenu(pageCount);
				restaurants = RestaurantDAO.getRdao().get(pageNo);
				cs.printRestaurants(restaurants);
				
				m = cs.showRegMenuMenu();
				result = MenuDAO.getMdao().reg(m);
				cs.printResult(result);
			} else if (menu == 3) {
				pageCount = RestaurantDAO.getRdao().getAllPageCount();
				pageNo = cs.showGetPageNoMenu(pageCount);
				restaurants = RestaurantDAO.getRdao().get(pageNo);
				cs.printRestaurants(restaurants);
			} else if (menu == 4) {
				pageCount = MenuDAO.getMdao().getAllPageCount();
				pageNo = cs.showGetPageNoMenu(pageCount);
				menus = MenuDAO.getMdao().get(pageNo);
				cs.printMenus(menus);
			}
		}
		cs.bye();
	}
}
