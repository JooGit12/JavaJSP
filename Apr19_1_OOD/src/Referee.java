public class Referee {
	static String[] ruleBook = { null, "가위", "바위", "보" };

	public static Enemy callBlueCorner() {
		return new Enemy();
	}

	public static User callRedCorner() {
		return new User();
	}

	public static void introduceGame() {
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		System.out.println("-----");
	}

	public static int requestBlueCornerFire(Enemy e) {
		return e.fire();
	}

	public static int requestRedCornerFire(User u) {
		System.out.print("뭐 : ");
		int up = u.fire();
		return (up < 1 || up > 3) ? requestRedCornerFire(u) : up;
	}

	public static void tellHand(int ep, int up) {
		System.out.printf("컴 : %s\n", ruleBook[ep]);
		System.out.printf("유저 : %s\n", ruleBook[up]);
	}

	public static int judge(int ep, int up) {
		int t = up - ep;
		if (t == 0) {
			System.out.println("무");
			return 0;
		} else if (t == -1 || t == 2) {
			System.out.println("패");
			return 234434523;
		} else {
			System.out.println("승");
			return 1;
		}
	}

	public static void tellResult(User u) {
		System.out.printf("%d연승\n", u.win);
	}

	public static void start() {
		Enemy e = callBlueCorner();
		User u = callRedCorner();
		introduceGame();

		int enemyPaper;
		int userPaper;
		int t = 0;
		while (true) {
			enemyPaper = requestBlueCornerFire(e);
			userPaper = requestRedCornerFire(u);
			tellHand(enemyPaper, userPaper);
			t = judge(enemyPaper, userPaper);
			if (t == 234434523) {
				break;
			}
			u.win += t;
		}
		tellResult(u);
	}

}
