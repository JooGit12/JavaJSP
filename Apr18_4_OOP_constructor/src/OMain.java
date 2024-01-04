// part1 : PP
// part2 : OOP
//		2-1 : OOP핵심
//		2-2 : 객체간의 관계
//		2-3 : Java만 해당하는 OOP얘기
// part3 : 이 과정을 진행하는데 유용할만한 내장 기능 소개 
// ------------------------------
public class OMain {
	public static void main(String[] args) {
		// 객체 만들기
		// 		클래스명 변수명 = new 생성자;
		Pen p = new Pen();
		p.name = "모나미153";
		p.color = "검정";
		p.price = 300;
		p.showInfo();
		System.out.println("-----");
		
		Snack s = new Snack("비스코프", 100, "로투스");
		s.print();
		System.out.println("-----");

		Weather w = new Weather(13.5, 40);
		w.print();
		System.out.println("-----");

		Human h = new Human("홍길동", 30);
		h.print();
	}
}




