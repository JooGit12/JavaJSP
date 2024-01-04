import java.util.Scanner;

// 중간고사 : 
// 기말고사 : 
// ------------------
// 평균 :  <- 소수점 이하 1자리까지만
// 수

public class CSMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("중간고사 : ");
		int midExam = k.nextInt();

		System.out.print("기말고사 : ");
		int finalExam = k.nextInt();

		System.out.println("-----");

		double avg = (midExam + finalExam) / 2.0;
		System.out.printf("평균 : %.1f점\n", avg);

		// 소스가 길다 -> 프로그램 용량이 크다 -> HDD를 많이
		// 소스 짧다 -> 용량 작다 -> HDD는 덜 씀, 변수를 사용 -> RAM을 더 씀
		String result = "가";
		if (avg >= 90) {
			result = "수";
		} else if (avg >= 80) {
			result = "우";
		} else if (avg >= 70) {
			result = "미";
		} else if (avg >= 60) {
			result = "양";
		} 
		System.out.println(result);
	}
}
