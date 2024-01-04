package com.kwon.apr201opi.main;

// OMain3.java에서 Scanner라는거는 무조건 내꺼
import com.kwon.apr201opi.product.Scanner;

// 패키지명 생략가능한 경우
//	- Java의 기본패키지 소속(java.lang)
//	- 같은패키지 소속
//	- import했다면

// ctrl + shift + o : import정리
import java.util.Random;

public class OMain3 {
	public static void main(String[] args) {
		//Random r = new Random();
		
		java.lang.String s = "ㅋ";
		java.lang.System.out.println(s);

		Dog d = new Dog();
		
		Scanner sc = new Scanner("캐논123", 500000, true);
		
	}
}



