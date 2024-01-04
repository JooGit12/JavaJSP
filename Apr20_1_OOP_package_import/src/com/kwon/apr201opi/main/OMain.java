package com.kwon.apr201opi.main;
import com.kwon.apr201opi.product.Scanner;
import com.kwon.apr201opi.product.Shoes;

// class명 중복되면... -> class명 중복안되게 지어야 할텐데
//	- Java에 내장된 class명 어떻게 다 알고...
//	- 전세계의 개발자들이 자기가 작업한거 공유하는 문화가 있는데,
//		그건 또 어떻게 다 알고
//	-> class명 중복안되게 짓는건 불가능

public class OMain {
	public static void main(String[] args) {
		Shoes s = new Shoes("에어맥스123", 50000, 260);
		s.printInfo();
		System.out.println("-----");
		// ABAV4413, 200000, 17인치 모니터
		// 출력
		System.out.println("-----");
		Scanner sc = new Scanner("캐논123", 500000, true);
		sc.printInfo();
		System.out.println("-----");
		Scanner k = new Scanner(System.in);
		
		
	}
}
