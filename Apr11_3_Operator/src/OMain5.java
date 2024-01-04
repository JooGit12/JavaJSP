import java.util.Scanner;

// 구매한 물건가격 : 35620
// 낸 돈 : 40000
// -------------------------
// 거스름돈 : 4380
//	5만원짜리 0개
//	1만원짜리 0개
//	5천원짜리 0개
//	1천원짜리 4개
//	5백원짜리 0개
//	1백원짜리 3개
//	5십원짜리 1개
//	1십원짜리 3개
public class OMain5 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("산거 : ");
		int price = k.nextInt();
		
		System.out.print("낸 돈 : ");
		int money = k.nextInt();
		
		System.out.println("-----");
		
		int remain = money - price;
		System.out.printf("거스름돈 : %d\n", remain);
		
		int oman = remain / 50000;
		System.out.printf("5만원짜리 : %d\n", oman);
		// remain = remain - (50000 * oman);
		// remain = remain % 50000;
		remain %= 50000;

		int man = remain / 10000;
		System.out.printf("1만원짜리 : %d\n", man);
		remain %= 10000;
		
		// ...
		
	}
}









