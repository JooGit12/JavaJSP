// method overloading

// 멤버변수명과 지역변수명/파라메터명이 같아도 되고
// , 같으면 가까운걸로 인식
// , 멤버변수명으로 인식시켜야하면 : this.

public class Snack {
	String name;
	int price;
	String maker;
	
	// JSP/Spring : 자동으로 객체를 기본생성자를 써서 만들어버림
	// 자동으로 기본생성자를 부를때가 있는데
	// 문화
	public Snack() {

	}
	
	// 개발자는 이걸 쓸텐데
	// 오버로딩된 생성자(overloaded constructor)
	public Snack(String name, int price, String maker) {
		// super();
		this.name = name;
		this.price = price;
		this.maker = maker;
	}

	public void print() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(maker);
	}
}
