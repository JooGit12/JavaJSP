public class AMain5 {
	public static void main(String[] args) {
		int 거스름돈 = 164320;
		// 계산이 많아 -> CPU많이
		int 화폐 = 50000;
		int 몇개;
		int 오이 = 5;
		while (true) {
			if (화폐 == 5) {
				break;
			}
			몇개 = 거스름돈 / 화폐;
			System.out.printf("%d원짜리 : %d\n", 화폐, 몇개);
			거스름돈 %= 화폐;
			화폐 /= 오이;
			오이 = (오이 == 5) ? 2 : 5;
		}
// 		배열 -> RAM을 많이
//		int[] 화폐단위 = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
//		int 몇개;
//		for (int 화폐 : 화폐단위) {
//			몇개 = 거스름돈 / 화폐;
//			System.out.printf("%d원짜리 : %d\n", 화폐, 몇개);
//			거스름돈 %= 화폐;
//		}
	}
}
