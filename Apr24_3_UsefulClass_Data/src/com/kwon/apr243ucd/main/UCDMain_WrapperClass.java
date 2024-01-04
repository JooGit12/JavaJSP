package com.kwon.apr243ucd.main;

// 기본형변수, 객체x -> 메소드가 없 -> 기능
// 데이터가 heap에 있어야 하는 경우가 생김
// => 기본형에 해당하는 객체형
// => WrapperClass
public class UCDMain_WrapperClass {
	public static void main(String[] args) {
		int a = 10;
		Integer aa = new Integer(10);
		
		double b = 3.4;
		Double bb = new Double(b);

		// 기본형 -> 객체형 : 생성자
		boolean c = true;
		Boolean cc = new Boolean(c);
		
		// 객체형 -> 기본형 : xxxValue()
		Long d = new Long(123);
		long dd = d.longValue();
		
		// 기본형 -> 객체형 : autoboxing
		int e = 10;
		Integer ee = e;
		
		// 객체형 -> 기본형 : autounboxing
		Double f = 123.12312;
		double ff = f;
		
		// 기본형 <-> 객체형 형변환은 자동
		System.out.println("--------");

		// 기본형 -> String
		int g = 30;
		String gg = g + "";
		String ggg = String.format("%d", g);
		
		// String -> WrapperC -> 기본형
		String h = "12.334";
		Double hh = Double.parseDouble(h);
		double hhh = hh.doubleValue();
		
		String i = "890";
		int ii = Integer.parseInt(i);
	}
}






