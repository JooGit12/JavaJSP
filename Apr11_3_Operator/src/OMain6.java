public class OMain6 {
	public static void main(String[] args) {
		double 바퀴둘레 = 100;
		int 앞기어수 = 4;
		int 뒷기어수 = 1;
		double 기어비 = 앞기어수 / (double) 뒷기어수;
		double 발구른횟수 = 10;
		double 이동거리 = 바퀴둘레 * 발구른횟수 * 기어비;
		System.out.println(이동거리);
	}
}
