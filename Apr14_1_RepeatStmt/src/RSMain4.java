import java.util.Random;
import java.util.Scanner;

// 가위 바위 보
// 나 1 2 3
// 컴 1 2 3
public class RSMain4 {
	public static String getHand(int n) {
		if (n == 1) {
			return "가위";
		} else if (n == 2) {
			return "바위";
		}
		return "보";
	}
	public static void printRule() {
//		for (int i = 1; i < 4; i++) {
//			System.out.printf("%d. %s\n", i, getHand(i));
//		}
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		System.out.println("-----");
	}
	public static int comFire() {
		Random r = new Random();
		return r.nextInt(3) + 1;
	}
	public static int userFire() {
		Scanner k = new Scanner(System.in);
		System.out.print("뭐 : ");
		int userHand = k.nextInt();
		return (userHand < 1 || userHand > 3) ? userFire() : userHand;
	}
	public static void printHand(int comHand, int userHand) {
		System.out.printf("컴 : %s\n", getHand(comHand));
		System.out.printf("나 : %s\n", getHand(userHand));
	}
	public static int judge(int comHand, int userHand) {
		int t = userHand - comHand;
		if (t == 0) {
			System.out.println("무");
			return 0;
		} else if (t == -1 || t == 2) {
			System.out.println("패");
			return 34985798;
		} else {
			System.out.println("승");
			return 1;
		}
	}
	public static void printScore(int win) {
		System.out.printf("%d연승\n", win);
	}
	public static void main(String[] args) {
		printRule();
		int comHand;		int userHand;
		int t;				int win = 0;
		while (true) {
			comHand = comFire();
			userHand = userFire();
			printHand(comHand, userHand);
			t = judge(comHand, userHand);

			if (t == 34985798) {
				break;
			}
			win += t;
			System.out.println("-----");
		}
		printScore(win);
	}

}
