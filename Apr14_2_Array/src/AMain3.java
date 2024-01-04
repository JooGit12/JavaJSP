// 배열
//		처음 만들때 사이즈 고정 -> 못바꿈
//			못바꾸면 어떡하나...
//			사이즈를 모르면 배열을 못만들겠네
//		자료형 못섞음
//		인덱스기반 -> 의미를 알기가 힘듬
//		=> 간단하게 데이터 여러개 표현할때는 써볼만한데
//		=> 주력으로 써먹기는...

// 객체지향 언어에서 2차원 배열 -> 잘못
public class AMain3 {
	public static void main(String[] args) {
		int[] age = { 10, 30 };
		// age[2] = 50;
		
		int[][] score = { { 100, 90 }, { 90, 80 } };
		System.out.println(score[0]);
		System.out.println(score[0][1]);

		for (int[] is : score) {
			for (int s : is) {
				System.out.println(s);
			}
		}
	}
}
