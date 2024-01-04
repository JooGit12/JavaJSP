// final 멤버변수 : 상수화(못바꾸게)
// final 메소드 : 오버라이딩 못하게
// final 클래스 : 상속 못받게
public /*final*/ class Human {
	String name;
	int age;
	static final String LIVE = "지구";
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public /*final*/ void introduce() {
		System.out.println(name);
		System.out.println(age);
	}
}
