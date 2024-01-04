package com.kwon.may25ctdb.jstlf;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class DataMaker {
	public static void make(HttpServletRequest req) {
		int a = 23123420;
		req.setAttribute("a", a);
		
		double b = 12.3;
		req.setAttribute("b", b);
		
		//String c = "20230525";
		Date c = new Date();
		req.setAttribute("c", c);
	}
}



