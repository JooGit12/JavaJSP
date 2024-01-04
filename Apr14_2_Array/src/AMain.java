// 조건문 : if/switch
// 반복문 : for/while/do-while
// 배열
// 그 언어만의 특징

// 배열(array)
// 		변수 1 = 데이터 n

public class AMain {
	public static void main(String[] args) {
		// int kor[];
		
		// 자료형[] 변수명 = new 자료형[데이터수];
		int[] eng = new int[3];
		eng[0] = 90;
		eng[1] = 80;
		eng[2] = 60;

		// 자료형[] 변수명 = new 자료형 { 값, 값, ... };
		int[] mat = new int[] { 50, 30, 99 };

		// 자료형[] 변수명 = { 값, 값, ... };
		int[] kor = { 100, 30, 80 };
		// 값 접근 : 변수명[인덱스] - 인덱스는 0번부터 셈
		System.out.println(kor[0]);
		// 데이터 수 : 변수명.length
		System.out.println(kor.length);
		
		for (int i = 0; i < kor.length; i++) {
			System.out.println(kor[i]);
		}
	}
}



