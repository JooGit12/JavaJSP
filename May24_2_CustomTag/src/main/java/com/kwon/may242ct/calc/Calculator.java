package com.kwon.may242ct.calc;

import javax.servlet.http.HttpServletRequest;

public class Calculator {
	public static void calculate(HttpServletRequest req) {
		int x = Integer.parseInt(req.getParameter("x"));
		int y = Integer.parseInt(req.getParameter("y"));
		
		int a = x + y;
		int b = x - y;
		int c = x * y;
		int d = x / y;
		
		req.setAttribute("result", new CalcResult(a, b, c, d));
	}
}
