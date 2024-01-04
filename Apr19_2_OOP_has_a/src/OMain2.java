
public class OMain2 {
	public static void main(String[] args) {
		Human h = new Human("김길동", "수원");
		h.showInfo();
		System.out.println("-----");
		
		Human h2 = new Human("김판서", "안양", h);
		h2.showInfo();
		System.out.println("-----");
		
		Company c = new Company("삼성", 100, h2);
		c.show();
		System.out.println("-----");
		
		Handphone hp = new Handphone("갤s", 300000, c);
		hp.print();
		System.out.println("-----");
		
		System.out.println(hp.name);// 폰 모델명
		System.out.println("-----");
		hp.print();					// 폰 전체정보
		System.out.println("-----");
		// 폰 만든회사 직원수
		System.out.println(hp.maker.employeeCount); 
		System.out.println("-----");
		
		// 폰 만든회사 전체정보
		hp.maker.show();
		System.out.println("-----");

		// 폰 만든회사 사장님 집 어디
		System.out.println(hp.maker.ceo.address);
		System.out.println("-----");
		
		// 폰 만든회사 사장님 자식 이름
		System.out.println(hp.maker.ceo.child.name);
		System.out.println("-----");
		
		// 폰 만든회사 사장님 자식 전체 정보
		hp.maker.ceo.child.showInfo();
	}
}


