
public class OMain3 {
	public static void main(String[] args) {
		Computer c = new Computer();
		c.cpu = "i7-1234";
		c.ram = 16;
		c.hdd = 500;
		c.show();
		System.out.println("-----");

		Computer c2 = new Computer();
		c2.cpu = "i5-5234";
		c2.ram = 8;
		c2.hdd = 250;
		c2.show();
		System.out.println("-----");

		// c랑 똑같은 사양의 컴퓨터가 하나 더 - x
		// c를 c3로도 부를수있게
		Computer c3 = c;
		c3.show();
		System.out.println("-----");
		
		// c3의 hdd를 1000으로
		c3.hdd = 1000;
		c3.show();
		System.out.println("-----");
		
		// ?
		c.show();

		c = null; // 참조형변수가 아무것도 안가리키는 상태
		c3 = null;
		
		// RAM : 재부팅하면 다 지워짐
		// OS가 RAM을 3공간으로 나눠서 관리
		//	?
		//	stack : 프로그램 종료되면 자동 반환
		//			프로그램이 종료 안됐으면?
		//	heap : 개발자가 수동으로 반환해야
		
		// Garbage Collection
		//		heap영역 자동정리
		//		그 자동의 발동시점이 언제
		//			그 번지를 가리키는 변수가 더 이상 없으면
	}
}




