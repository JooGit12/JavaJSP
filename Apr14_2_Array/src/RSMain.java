// 반복문
//		반복횟수 : for
//		배열탐색용 : foreach
//		반복조건 : while/do-while

public class RSMain {
	public static void main(String[] args) {
		double[] footSize = { 230.5, 220.1, 260.5, 270.5, 280.2 };
		// footSize.length : 갯수(5)
		for (int i = 0; i < footSize.length; i++) { // 0 ~ 4
			double f = footSize[i]; 
			System.out.println(f);
		}
		System.out.println("-----");
		// for (자료형 변수명 : 배열명){
		//
		// }
		// 순서조절불가
		// i가 없어서 -> 프로그램적으로 활용도 낮음
		for (double f : footSize) {
			System.out.println(f);
		}
	}
}
