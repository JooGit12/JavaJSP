import java.util.Scanner;

// 단항 : !a
// 이항 : a + b, a > b, ...
// 삼항 : a ? b : c

public class OMain3 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = k.nextInt();
		
		System.out.println("-----");
		// 나이가 20살 이상이면 어서오세요
		// 안되면 나가
		// 조건식 ? 참일때쓸값 : 거짓일때쓸값 
		String say = (age >= 20) ? "어서오세요" : "나가";
		System.out.println(say);
		System.out.println("-----");
		
		// << : shift연산
		//		x를 2진수로 바꾸면 : 11
		//		y만큼 왼쪽으로 밀고, 빈자리에는 0채우기 : 
		//		1100
		//		=> 다시 10진수로 바꾸면 12
		//		=> 다중선택상황에
		int x = 3;
		int y = 2;
		int z = x << y;
		System.out.println(z);
		
		// 특성 - 중에 여러개
		//		이탤릭 : 1 << 0 = 1
		//		굵게 : 1 << 1 = 2
		//		밑줄 : 1 << 2 = 4
		
		// 정렬 - 중에 하나
		//		왼쪽	: 1
		//		가운데	: 2
		//		오른쪽	: 3
		//		맞춤	: 4
	}
}



