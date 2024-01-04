// 배열은 참조형
// Call by Reference, Call by Value
// => 기본형은 함수에서 건드려도 원본에는 영향 없음
//    참조형은 함수에서 건들면 원본에 영향이 감
public class FMain {
	public static void test(int a, int[] b, int[] c) {
		System.out.println(a);
		System.out.println(b[0]);
		System.out.println(c[0]);
		a = 100;
		b[0] = 100;
		c = new int[] {100, 200};
		System.out.println(a);
		System.out.println(b[0]);
		System.out.println(c[0]);
	}
	public static void main(String[] args) {
		int a = 10;
		int[] b = { 10, 20 };
		int[] c = { 10, 20 };
		System.out.println(a);
		System.out.println(b[0]);
		System.out.println(c[0]);
		test(a, b, c);
		System.out.println(a);
		System.out.println(b[0]);
		System.out.println(c[0]);
	}
}
