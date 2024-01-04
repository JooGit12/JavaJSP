// Pen is a Product
// Product : 상위, super, 부모 클래스
// Pen : 하위, 자식 클래스
// 상속관계 맺어준
// Product로부터 상속받은 Pen
public class Pen extends Product {
	// Product에 있는 멤버들 물려받아옴
	String color;
	
	// Product에 있는 printInfo메소드 물려받아왔는데
	// 이름/가격출력 -> 아쉬움
	// 지금 추가된 색깔도 출력됐으면
	// overriding : 물려받아온 메소드 재정의
	@Override
	public void printInfo() {
		// Product에 있는 printInfo부르니 -> 이름/가격
		super.printInfo(); 
		System.out.println(color);
	}
}

// @XXX : annotation
//		XXX자리에 뭐 들어가냐에 따라 천차만별
//		원래는 사람이 직접 ~~해야하는데
//		annotation쓰면 자동으로 처리되는

// @Override
//		바로 밑에 오버라이딩 메소드가 
//		아닌거 들어가면 에러
//		없어도 되는데
//		소스 봤을때 오버라이딩 메소드임이 바로 확인 가능
