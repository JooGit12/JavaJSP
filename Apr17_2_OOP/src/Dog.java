// Java의 문화 : 클래스명 대문자로 시작
public class Dog {
	// 속성 : 그 객체만의 특징적인 값
	// member variable, attribute, field
	String name;
	int age;
	
	// 액션/프로그램상 필요한 기능
	// method
	public void bark() {
		System.out.println("멍");
	}

	public void showInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}
