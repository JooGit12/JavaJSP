package com.kwon.apr201opi.main;
// package : class명이 중복될 때 구분할 수단
//			모든 class는 package속에 넣는걸로
//			package명이 중복되면? -> 끝 
//			-> package명 전세계적으로 중복안되게 잘 지어야
//			-> 소속.프로그램명.카테고리
//			-> com.soldesk.cafe903.product

// 객체만드는 문법
//		패키지명.클래스명 변수명 = new 패키지명.생성자;
public class OMain2 {
	public static void main(String[] args) {
		java.util.Scanner k 
			= new java.util.Scanner(java.lang.System.in);
		
		com.kwon.apr201opi.product.Scanner sc
			= new com.kwon.apr201opi.product.Scanner("캐논123", 500000, true);
	}
}





