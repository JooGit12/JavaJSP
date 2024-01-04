// constructor : 객체 만들때 쓰는 메소드
//	1) 생성자 하나도 안만들어놓으면
//		-> Java가 기본생성자 자동으로 만들어줌
//		-> 생성자가 뭐라도 있으면 : 기본생성자 안만들어줌
//	2) 다양한 이유로 기본생성자가 없으면 곤란
//		2-1) 문화
//		2-2) 하위클래스 객체 만들면 자동으로 상위클래스 기본생성자 부르니
//		2-3) JSP/Spring이 자동으로 객체 만들때 기본생성자 부르니
public class Menu {
	String name;
	int price;
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	
	public Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void show() {
		System.out.println(name);
		System.out.println(price);
	}
}
