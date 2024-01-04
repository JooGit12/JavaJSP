package com.kwon.apr243ucd.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UCDMain2 {
	public static void main(String[] args) {
		try {
			// 본인이 무슨요일에 태어났나
			String bd = "19870527";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Date bdd = sdf.parse(bd);
			SimpleDateFormat sdf2 = new SimpleDateFormat("E");
			String yoil = sdf2.format(bdd);
			System.out.println(yoil);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("-----");
		
		// 몇 살(한국나이)
		String bd2 = "19750301";
		String y = bd2.substring(0, 4);
		int birthYear = Integer.parseInt(y);
		
		Date now = new Date();
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy");
		String cy = sdf3.format(now);
		int curYear = Integer.parseInt(cy);
		
		int age = curYear - birthYear + 1;
		System.out.println(age);
	}
}






