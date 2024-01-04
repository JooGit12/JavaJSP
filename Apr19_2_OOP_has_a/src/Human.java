// 객체간의 관계
//		사람 has a String : 이름
//		사람 has a String : 주소
//		사람 has a 개 : 반려동물
//		개 has a 사람 : 주인
public class Human {
	String name;
	String address;
	Dog pet;
	Human child;

	public Human() {
		// TODO Auto-generated constructor stub
	}
	
	public Human(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Human(String name, String address, Human child) {
		super();
		this.name = name;
		this.address = address;
		this.child = child;
	}

	public void showInfo() {
		System.out.println(name);
		System.out.println(address);
		if (child != null) {
			child.showInfo();
		}
	}

}


