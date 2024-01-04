public class OMain {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.name = "모나미153";
		p.price = 500;
		p.color = "검정";
		p.printInfo();
		System.out.println("-----");
		
		Milk m = new Milk();
		m.name = "서울우유";
		m.price = 3000;
		m.expDate = "2023/05/01";
		m.printInfo();
		System.out.println("-----");
		
		Computer c = new Computer();
		c.name = "매직스테이션123";
		c.price = 700000;
		c.cpu = "i7-1234";
		c.ram = 16;
		c.hdd = 500;
		c.printInfo();
		System.out.println("-----");
		
		Notebook n = new Notebook();
		n.name = "그램1234";
		n.price = 1500000;
		n.cpu = "i5-1233";
		n.ram = 16;
		n.hdd = 250;
		n.weight = 5;
		n.printInfo();
	}
}



