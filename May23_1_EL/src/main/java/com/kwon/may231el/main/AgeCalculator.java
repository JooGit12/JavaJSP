package com.kwon.may231el.main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class AgeCalculator {
	public static void calculate(HttpServletRequest req) {
		String j1 = req.getParameter("j1");
		int j2 = Integer.parseInt(req.getParameter("j2"));
		String by = j1.substring(0, 2);
		by = (j2 < 3) ? ("19" + by) : ("20" + by);
		int birthYear = Integer.parseInt(by);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String cy = sdf.format(new Date());
		int curYear = Integer.parseInt(cy);
		
		int age = curYear - birthYear + 1;
		req.setAttribute("age", age);
		
		Dog d = new Dog("후추",3);
		req.setAttribute("d", d);
		
		ArrayList<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog("후추", 2));
		dogs.add(new Dog("흐츠", 3));
		dogs.add(new Dog("휴츄", 4));
		req.setAttribute("dogs", dogs);
	}
}







