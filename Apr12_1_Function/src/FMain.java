// JRE(Java Runtime Env) : Java로 만든 프로그램 실행하려면 필요
// JDK(Java Dev Kit) : Java로 개발가능, JRE도 포함되어있음
// JVM(Java Virtual Machine)
// ------------------------------------------
// 다른언어 개발자 : Windows에서 실행되는 프로그램 개발
// Java개발자 : JVM에서 실행되는 프로그램 개발

// 한국어로 설계 -번역(개발)-> 		.java
// .java         -번역(compile)-> 	.class
// .class		 -압축->			.jar(Java ARchive)
// .jar			 -실행-> JRE가 JVM을 만들어서 OS위에 올림
// JVM이 main()을 부름
// ------------------------------------------
// 함수(function)
//		관련있는 작업들 묶어서 정의해놓고
//		필요할때마다 사용
//		소스 정리 차원에서 

// ctrl + shift + /(numpad)
// ctrl + shift + *(numpad)

public class FMain {
	// 1) 함수 정의
	// 			  returnType : 함수 결과로 뭐 나오나
	// 							parameter(인자)
	// 								함수 수행하는데 필요한 재료
	// 								필요없으면 안해도
//	public static 자료형 함수명(자료형 변수명, 자료형 변수명, ...) {
//		
//	}

	// 함수명 짓는 조건 == 변수명 짓는 조건
	// 변수 : 명사
	// 함수 : 동사

	// 콘솔에 출력만하고 땡 -> 결과로 나오는게 없음
	// 단순 콘솔출력 -> 필요한 재료도 딱히 없음
	public static void yaDambae() {
		System.out.println("엄마한테 가서 만원 받아서");
		System.out.println("슈퍼 가서");
		System.out.println("한라산 한갑 달라고 하고");
		System.out.println("니 과자 하나 사고");
		System.out.println("한라산 가져와");
	}

	// 함수명 같으면 안되는데 : 호출할때 구분이 안되니
	// 근데 parameter가 다르면 : 호출할때 구분이 됨
	// => parameter부분이 다르면(자료형, 갯수) 함수명이 같아도 됨
	// 함수 overloading : 일부러 함수명 같게 짓는 테크닉

	// 정수 2개 넣으면 그 합을 출력하는 함수
	public static void printSum(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	// 실수 3개 넣으면 그 합 출력하는 함수
	public static void printSum(double a, double b, double c) {
		double d = a + b + c;
		System.out.println(d);
	}
	
	// 초를 넣으면 밀리초로 바꿔주는 함수
	public static int toMilliSec(int sec) {
		int milliSec = sec * 1000;
		return milliSec; // 이 함수를 호출한쪽으로 결과를 돌려주고 함수 끝
	}
	
	// 정수2개를 넣으면 더 큰 숫자를 구해주는 함수
	public static int getBigger(int x, int y) {
		return (x > y) ? x : y;
	}
	
	// 정수 1개 넣으면 "홀","짝" 구해주는 함수
	public static String getOddEven(int x) {
		return (x % 2 == 0) ? "짝" : "홀";
	}
	
	// main함수 : JVM이 자동으로 부름
	public static void main(String[] args) throws InterruptedException {
		int bigger = getBigger(3, 1);
		System.out.println(getOddEven(bigger));
		
		int ms = toMilliSec(bigger);
		Thread.sleep(ms);
		printSum(10, 30);
		printSum(1.2, 3.5, 10.7);
		// 2) 함수 호출 : 함수명(값, 값, ...);
		System.out.println("-----");
		printSum(30, 10);
		System.out.println("-----");
		yaDambae();
	}

}
