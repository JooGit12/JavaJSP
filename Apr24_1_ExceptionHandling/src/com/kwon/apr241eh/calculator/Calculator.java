package com.kwon.apr241eh.calculator;

// 내 동생의 요청으로 시작된 프로젝트
//	나누기 기능이 있는데 -> 
//	다른 프로젝트에서도 쓰일듯 ->
// 	챙겨두자 -> .jar

// main은 개발팀장
// 클래스를 작업하게 될 신입 개발자
//		직접 처리 -> 책임지나? 
//		=> 대응은 개발팀장이 하는게 맞지

//		프로젝트가 달라지면 대응방법도 달라져야 할텐데
public class Calculator {
//	1) 직접 처리 : try - catch - finally
	public static int divide(int x, int y) {
		try {
			return x / y;
		} catch (Exception e) {
			System.out.println("나누기 0이 어딨냨");
			return -999;
		} finally {
			System.out.println("어쨌든 계산 끝ㅋ");
		}
	}
	
//	2) 미루기 : throws
//	divide2를 수행하다가 Arith...가 발생한거
//	divide2를 호출한쪽에서 처리해라
	public static int divide2(int x, int y) throws ArithmeticException {
		return x / y;
	}
	
	
}




