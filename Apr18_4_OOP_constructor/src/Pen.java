// 생성자 - constructor
//		객체가 만들어질때 뭐 하고싶으면(기본값을 준다든지...)
//		리턴이 아예 없는, 클래스명과 같은 이름의 메소드
//		생성자라는걸 전혀 건들지 않으면
//			Java가 compile할때 기본생성자를 자동으로 만들어서 씀


public class Pen {
	String name;
	String color;
	int price;
	static String maker = "모나미";

	// ctrl + space
	// default constructor(기본 생성자)
	public Pen() {
		System.out.println("볼펜 입고됨");
	}
	
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
		System.out.println(maker);
	}
}
