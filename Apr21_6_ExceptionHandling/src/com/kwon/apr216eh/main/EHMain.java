package com.kwon.apr216eh.main;

import java.util.Scanner;

// 설계   -번역(개발)->		.java
// .java  -번역(compile)-> 	.class
// .class -압축-> 			.jar

// error : Java문법에 안맞게 써서
//			기계어로 번역(compile)이 불가능한 상태
//			최종산출물이 못나오겠고
//			개발자 잘못

// warning : 지저분한 소스
//			문제없이 최종산출물까지 나오는
//			정리해주는게 좋을 것
//			개발자 잘못

// exception : 프로그램에는 문제 없
//			실행중에 외부적인 요인에 의해 제대로 안되는
//			개발자 잘못 - x
//			누군가는 해결해야 -> 개발자가 좀 대비를...

// 예외처리
//	1) 직접처리(try - catch - finally)
//		try {
//			여기를 일단 실행
//		} catch (예외종류 변수명) {
//			그 예외가 발생하면 바로 이쪽으로
//		} catch (예외종류 변수명) {
//			그 예외가 발생하면 바로 이쪽으로
//		} ...
//		} finally {
//			예외 발생 여부와는 상관없이 무조건 실행
//			return보다 먼저
//		}
//	2) ...
public class EHMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("x : ");
		int x = k.nextInt();

		System.out.print("y : ");
		int y = k.nextInt();

		System.out.println("-----");
		
		
		// 정상  : 47 - 48 - 49
		// y에 0 : 47 - 48(AE발생) - 50 - 51 
//		try {
//			System.out.println(x / y);
//			System.out.println("끝");
//		} catch (ArithmeticException e) {
//			System.out.println("나누기 0은 없다");
//		}

		// y에 1 : 57 - 58 - 59 - 60
		// y에 0 : 57 - 58(AE) - 61 - 62 
		// y에 3 : 57 - 58 - 59 - 60(AIOOBE) - 63 - 64
//		try {
//			System.out.println(x / y);
//			int[] ar = {21, 123, 213};
//			System.out.println(ar[y]);
//		} catch (ArithmeticException e) {
//			System.out.println("나누기 0은 없다");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열에 그거 없음");
//		}
		
		try {
			System.out.println(x / y);
			int[] ar = {21, 123, 213};
			System.out.println(ar[y]);
		} catch (Exception e) {
			e.printStackTrace(); // 개발하면서 상황파악
			System.out.println("하여튼 문제 생긴");
		} 
		
		System.out.println("문제가 생겼든지 말든지 무조건");
		
	}
}






