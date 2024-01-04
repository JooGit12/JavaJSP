import java.util.Random;

// 기존의 Random : 랜덤 뽑는 기능 + 홀수만
public class KwonRandom extends Random {
	// 물려받아온 nextInt 기능 + 짝수 나오면 다시 하게
	@Override
	public int nextInt(int bound) {
		int x = super.nextInt(bound);
		return (x % 2 == 0) ? nextInt(bound) : x;
	}
}
