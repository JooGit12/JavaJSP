package com.kwon.may25ctdb.jstlc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class Referee {
	public static void judge(HttpServletRequest req) {
		int n = Integer.parseInt(req.getParameter("n"));
		String oe = (n % 2 == 1) ? "홀수" : "짝수";
		req.setAttribute("oeResult", oe);
		
		ArrayList<Menu> menus = new ArrayList<>();
		menus.add(new Menu("야채김밥", 5000));
		menus.add(new Menu("제육덮밥", 5500));
		menus.add(new Menu("된찌", 5500));
		req.setAttribute("menus", menus);
	}
}



