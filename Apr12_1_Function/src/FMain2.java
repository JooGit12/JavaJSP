// 함수 재귀적 호출(recursive call)
// 		함수 속에서 자기자신을 호출해서
//		-> 반복이 생기는
//	1) 수업을 안해
//	2) 하기는 하는데 용도를 잘못

//	함수 : 소스 정리, 느려짐
//		함수호출 : JUMP연산을 하게 되는데 -> 느려짐
//		계산문제 : 반복문으로

public class FMain2 {
	// return getHab(4) + 5
	// return return getHab(3) + 4 + 5
	// return return return getHab(2) + 3 + 4 + 5
	// return return return return getHab(1) + 2 + 3 + 4 + 5
	// return return return return 1 + 2 + 3 + 4 + 5
	public static int getHab(int n) {
		return (n == 1) ? 1 : (getHab(n - 1) + n);
	}

	// 정수를 하나 넣으면
	// factorial구하는 함수
	// 4! = 4 x 3 x 2 x 1
	public static int getFactorial(int n) {
		return (n != 1) ? (n * getFactorial(n - 1)) : 1;
	}

	// 정수를 하나 넣으면
	// 피보나치수열 값 구하는 함수
	// 1 1 2 3 5 8 13 21
	// getFibo(1) = 1
	// getFibo(2) = 1
	// getFibo(3) = getFibo(1) + getFibo(2)
	// getFibo(4) = getFibo(2) + getFibo(3)
	// getFibo(5) = getFibo(3) + getFibo(4)
	public static int getFibo(int pos) {
		return (pos < 3) ? 1 : (getFibo(pos - 2) + getFibo(pos - 1));
	}

	public static void main(String[] args) {
		System.out.println(getFibo(50));
		System.out.println(getFactorial(4));
		System.out.println(getHab(5));
	}
}
