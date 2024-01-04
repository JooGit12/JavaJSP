public class OMain {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.name = "후추";
		d.age = 3;
		d.showInfo();
		System.out.println("-----");
		
		Human h = new Human("홍길동", "수원");
		h.pet = d;
		h.showInfo();
		System.out.println("-----");
		System.out.println(h.name); // 사람 이름
		System.out.println(h.address); // 사람 집
		System.out.println(h.pet); // 사람의 반려동물
		System.out.println(h.pet.name); // 사람의 반려동물의 이름
	}
}



