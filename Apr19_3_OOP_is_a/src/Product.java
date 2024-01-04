// constructor
//		상속 안됨 => 각자 다 만들어야

//		하위클래스(Milk) 객체 만들면
//		=> 자동으로 상위클래스(Product) 기본생성자를 불러버림
//		=> 다른거 부르면 그냥 그걸로

public class Product extends Object {
	String name;
	int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}




	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
	}
}
