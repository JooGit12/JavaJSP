package com.kwon.apr241eh.main;

import java.util.Scanner;

import com.kwon.apr241eh.calculator.Calculator;

// part1 : PP
// part2 : OOP
// --------------------> 예외처리
// part3 : 웹/빅데/인 를 하기에 유용할것같은
//		내장/외부 클래스 소개

public class EHMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = k.nextInt();
		
		System.out.print("y : ");
		int y = k.nextInt();
		
		System.out.println("-----");
		
		// System.out.println(Calculator.divide(x, y));
		try {
			System.out.println(Calculator.divide2(x, y));
		} catch (Exception e) {
			System.out.println("나누기 0?ㅋ");
		}
	}
}



