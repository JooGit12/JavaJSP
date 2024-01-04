package com.kwon.apr211oa.main;

import com.kwon.apr211oa.avengers.Avengers;
import com.kwon.apr211oa.avengers.Ironman;

public class OMain {
	public static void main(String[] args) {
		// Java는 객체를 만들면서 클래스 만드는게 가능
		// 클래스명이 없는 Avengers의 하위클래스
		// anonymous inner class
		Avengers a = new Avengers() {
			@Override
			public void attack() {
				System.out.println("거미줄 발사");
			}
		};
		a.attack();
		
		System.out.println("-----");
		Ironman i = new Ironman("토니", 40, "자비스");
		i.showInfo();
		i.attack();
		System.out.println("-----");
		// 배너, 30살, 바지가 99인 헐크
		// 정보출력하기
		// 공격하기 : 주먹질
	}
}
