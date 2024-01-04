
public class RSMain2 {
	public static void main(String[] args) {
		// 2단
		for (int i = 1; i <= 9; i++) {
			System.out.printf("2 x %d = %d\n", i, 2 * i);
		}
		System.out.println("-----");
		// 2단 ~ 9단(2 x 1 = 2 -> 2 x 2 = 4 -> ...)
		for (int dan = 2; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			}
		}
		System.out.println("-----");

		// 2단 ~ 9단(표 모양)(2 x 1 = 2 -> 3 x 1 = 3 -> ...)
		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.printf("%d x %d = %d\t", dan, i, dan * i);
			}
			System.out.println();
		}
		System.out.println("-----");

		// ㅋㅋㅋㅋㅋ
		// ㅋㅋㅋㅋㅋ
		// ㅋㅋㅋㅋㅋ
		// ㅋㅋㅋㅋㅋ
		// ㅋㅋㅋㅋㅋ
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("ㅋ");
			}
			System.out.println();
		}
		System.out.println("-----");
		// ㅋ
		// ㅋㅋ
		// ㅋㅋㅋ
		// ㅋㅋㅋㅋ
		// ㅋㅋㅋㅋㅋ
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("ㅋ");
			}
			System.out.println();
		}
		System.out.println("-----");
		// ㅋㅋㅋㅋㅋ
		// ㅋㅋㅋㅋ
		// ㅋㅋㅋ
		// ㅋㅋ
		// ㅋ
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5 - i); j++) {
				System.out.print("ㅋ");
			}
			System.out.println();
		}
		System.out.println("-----");
		// ㅋ
		// ㅋ
		// ㅋ
		// ㅋ
		// ㅋ
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			System.out.println("ㅋ");
		}
		System.out.println("-----");
//		ㅋ
//		ㅋㅎ
//		ㅋㅎㅋ
//		ㅋㅎㅋㅎ
//		ㅋㅎㅋㅎㅋ
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((j % 2 == 1) ? "ㅎ" : "ㅋ");
			}
			System.out.println();
		}
		System.out.println("-----");
//		ㅋ
//		ㅎㅎㅎ
//		ㅋㅋㅋㅋㅋ
//		ㅎㅎㅎㅎㅎㅎㅎ
//		ㅋㅋㅋㅋㅋㅋㅋㅋㅋ
		String s;
		for (int i = 0; i < 5; i++) {
			s = (i % 2 == 1) ? "ㅎ" : "ㅋ";
			for (int j = 0; j <= (i * 2); j++) {
				System.out.print(s);
			}
			System.out.println();
		}
	}
}

