// member variable : 객체의 속성
//		초기값 있음
//			숫자계열 : 0
//			참조형 : null
// method parameter : 그 메소드 수행하는데 필요한 재료
//		초기값 없음 -> 호출할때 어차피 넣으니
// local variable : 그 메소드 수행하는동안만 쓰고 버리는 임시 변수
//		초기값 없음 -> 초기화 하고 써야
public class Calculator {
	int price; // 초기값을 주는걸 쓰레기 코드라 함
	
	public void printHab(int x, int y) {
		// int a;
		// System.out.println(a);
		int hab = x + y;
		System.out.println(hab);
	}
}
