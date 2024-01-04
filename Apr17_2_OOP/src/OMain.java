// Part 1 : PP(Procedural Programming)
//		절차지향프로그래밍
//		순서에 맞게 조건문, 반복문 최적으로 써서
//		효율적인 프로그램 만들자

//		컴 좋아져서, 그렇게까지는 안해도...
//		알고리즘의 시대 -> 유지보수의 시대
//		유지보수에 좋으려면 소스 알아보기 편해야

// 프로그래밍 언어가 왜 어렵
//		일상언어랑 문법이 너무 달라서

// Part 2 : OOP(Object Oriented Programming)
//		객체지향프로그래밍
//		유지보수의 시대를 맞이해서
//		알아보기 편하게 소스 쓰자
//		=> 일상언어에 가깝게 
//		=> 객체라는걸 써서 RealWorld를 묘사하자
public class OMain {
	public static void main(String[] args) {
		String name = "후추";
		int age = 3;
		System.out.println(name);
		System.out.println(age);
		System.out.println("-----");
		// 객체는 다 참조형
		// class : 객체 만들때 필요한거(붕어빵틀, 도장)
		// object/instance : 실생활에 존재하는 그 뭐(붕어빵)
		// 객체 만들기
		//		클래스명 변수명 = new 클래스명();
		Dog d = new Dog();
		d.name = "후추";
		d.age = 3;
		d.bark();
		d.showInfo();
		System.out.println("-----");
		
		Restaurant r = new Restaurant();
		r.name = "김천";
		r.table = 10;
		r.starPoint = 4.5;
		r.reservable = false;
		r.printInfo();
		System.out.println("-----");
		
		Restaurant r2 = new Restaurant();
		r2.name = "굿모닝";
		r2.table = 30;
		r2.starPoint = 3.5;
		r2.reservable = true;
		r2.printInfo();
		
		System.out.println(r);
		System.out.println(r2);
		
	}
}





