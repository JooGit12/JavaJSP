package com.kwon.apr242eh.main;

import java.io.FileWriter;
import java.util.Scanner;

import com.kwon.apr241eh.calculator.Calculator;

// 동생꺼 끝나고 몇달 뒤
// 국방부장관이 : 회사에서 새 프로젝트 시작
// 그때 챙겨놨던 나누기 기능 쓰면 되겠

// 뭐가 위험한가 어떻게 아나
//		Java는 예외처리를 안하면 에러
//		하기싫어도 해야
public class EHMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("소총가격 : ");
		int price = k.nextInt();
		
		System.out.print("수량 : ");
		int quantity = k.nextInt();
		
		System.out.println("-----");
		
		// 그 때 try-catch-finally로
		//System.out.println(Calculator.divide(price, quantity));
		
		// 그 때 throws
		try {
			System.out.println(Calculator.divide2(price, quantity));
		} catch (Exception e) {
			System.out.println("0을 잘못 쓰셨나봅니다");
		}
	}
}




