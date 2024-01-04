import java.util.Random;

public class Friend {
	Random brain = new Random();
	public int thinkAns() {
		return brain.nextInt(10000) + 1;
	}
	public int ask(Me m) {
		System.out.print("뭐 : ");
		int ua = m.tell();
		return (ua < 1 || ua > 10000) ? ask(m) : ua;
	}
	public boolean judge(int gameAns, int userAns) {
		if (gameAns == userAns) {
			System.out.println("정답");
			return true;
		} else if (gameAns > userAns) {
			System.out.println("UP");
		} else {
			System.out.println("DOWN");
		}
		return false;
	}
	public void tellResult(int turn) {
		System.out.printf("%d턴만에 정답\n", turn);
	}
	public void start(Me m) {
		int gameAns = thinkAns();
		System.out.println(gameAns);

		int userAns;
		for (int turn = 1; true; turn++) {
			userAns = ask(m);
			if (judge(gameAns, userAns)) {
				tellResult(turn);
				break;
			}
		}
	}
}
