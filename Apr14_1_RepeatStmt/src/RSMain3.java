import java.util.Random;
import java.util.Scanner;

// 1. 설계
// 2. 자바로 번역(거의 직역)
// 3. 다듬기
public class RSMain3 {
	public static int pickGameAns() {
		Random r = new Random();
		return r.nextInt(10000) + 1;
	}

	public static int tell() {
		Scanner k = new Scanner(System.in);
		System.out.print("뭐 : ");
		int userAns = k.nextInt();
		return (userAns < 1 || userAns > 10000) ? tell() : userAns;
	}

	// 그만해야하나 판정해주는 함수
	public static boolean judge(int gameAns, int userAns) {
		if (gameAns > userAns) {
			System.out.println("UP");
		} else if (gameAns < userAns) {
			System.out.println("DOWN");
		} else {
			return true;
		}
		return false;
	}

	public static void printResult(int turn) {
		System.out.printf("%d턴만에 정답\n", turn);
	}

	public static void main(String[] args) {
		int gameAns = pickGameAns();
		int userAns;
		// int turn = 0;
		// while (true) {
		// 	turn++;
		for (int turn = 1; true; turn++) {
			userAns = tell();
			// == true는 생략가능
			// == false는 !값 형태로
			if (judge(gameAns, userAns)) {
				printResult(turn);
				break;
			}
		}
	}
}
