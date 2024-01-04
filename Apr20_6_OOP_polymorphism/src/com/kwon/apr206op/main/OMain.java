package com.kwon.apr206op.main;

import com.kwon.apr206op.avengers.Avengers;
import com.kwon.apr206op.avengers.Hulk;
import com.kwon.apr206op.avengers.Ironman;
import com.kwon.apr206op.human.Human;
// polymorphism(다형성)
//		그 언어가 dynamic loading을 해야
//		변수를 만들때는 상위타입
//		실제로 객체 만들어 넣을때 하위타입
//		=> 실제 정체는 하위타입

//		static loading : 변수 자료형따라서 최종 정체가 정해지는
//		dynamic loading : 실제로 만들어넣은 객체 따라서 최종 정체가
public class OMain {
	public static void main(String[] args) {
		// Ironman i = new Ironman();
		// Ironman i2 = new Hulk(); // x
		// Avengers a = new Ironman(); // o
		// Ironman i3 = new Avengers(); // x

		Avengers a = new Ironman();
		a.print();

		Ironman i = new Ironman("토니", 40, "자비스");
		Hulk h = new Hulk("배너", 30, 88);
		// 들을 관리
		Avengers[] aa = { i, h };
		for (Avengers aaa : aa) {
			aaa.print();
			System.out.println("-----");
		}
		
		Human human = new Human();
		human.helpMe(h);
	}
}



