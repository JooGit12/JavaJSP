import java.util.Arrays;
import java.util.Random;

public class PMain2 {
	public static int pick(int pos, int[] lotto) {
		Random r = new Random();
		int n = r.nextInt(45) + 1;
		for (int i = 0; i < pos; i++) {
			if (n == lotto[i]) {
				return pick(pos, lotto);
			}
		}
		return n;
	}
	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = pick(i, lotto);
		}
		Arrays.sort(lotto);
		for (int i : lotto) {
			System.out.println(i);
		}
	}
}
