import java.util.Random;
import java.util.Scanner;

// 반복문
//		반복횟수 : for
//		반복조건 :
//				while 
//				do-while(조건식 검사를 나중에 하니 -> 최소 한번의 반복은 보장)

// while (조건식) {
//		조건식 만족하면 여기 실행하고 다시 조건식 검사하러
// }
public class RSMain {
	public static void main(String[] args) {
		// 1 + 2 + 3 + ... + 20 = ?
		int a = 0;
		for (int i = 1; i < 25; i++) {
			a += i;
		}
		System.out.println(a);
		System.out.println("-----");
		// 1 + 2 + 3 + ... + ? >= 300
		int b = 0;
		int i = 0;
		while (b < 300) {
			i++;
			b += i;
		}
		System.out.println(i);
		System.out.println("-----");

		Random r = new Random(); // 랜덤뽑을준비
		int c = r.nextInt(10); // 0 ~ (10 - 1)사이 랜덤 뽑기
		System.out.println(c);
		System.out.println("-----");
		
		// 랜덤을 9가 나올때까지 계속 뽑기
		int d = r.nextInt(10);
		System.out.println(d);
		while (d != 9) {
			d = r.nextInt(10);
			System.out.println(d);
		}
		System.out.println("-----");
		
		// 나이 -1이라고 쓸 때까지 계속 입력받기
		Scanner k = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = k.nextInt();
		System.out.println(age);
		do {
			System.out.print("나이 : ");
			age = k.nextInt();
			System.out.println(age);
		} while (age != -1);
//		while (age != -1) {
//			System.out.print("나이 : ");
//			age = k.nextInt();
//			System.out.println(age);
//		}
		
	}
}






