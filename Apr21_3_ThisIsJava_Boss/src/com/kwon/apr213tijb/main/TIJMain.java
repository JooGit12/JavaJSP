package com.kwon.apr213tijb.main;

import com.kwon.apr213tijb.avengers.Ironman;

// 사수 : 딴짓못하게 -> 추상메소드
//			신입에게 interface만들어주면서 업무지시 

// 추상메소드 쓰려면
//		abstract class vs interface
//		근데 자바는 다중상속이 안되니
//		추상클래스를 주면 -> 상속라인이 막힘
public class TIJMain {
	public static void main(String[] args) {
		Ironman i = new Ironman();
		i.attack();
	}
}
