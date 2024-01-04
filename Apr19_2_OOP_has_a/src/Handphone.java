
public class Handphone {
	String name;
	int price;
	Company maker;
	
	public Handphone() {
		// TODO Auto-generated constructor stub
	}

	public Handphone(String name, int price, Company maker) {
		super();
		this.name = name;
		this.price = price;
		this.maker = maker;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(price);
		maker.show();
	}
	
}
