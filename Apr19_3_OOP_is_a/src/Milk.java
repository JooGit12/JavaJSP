public class Milk extends Product {
	String expDate;

	public Milk() {
		// TODO Auto-generated constructor stub
	}

	public Milk(String name, int price, String expDate) {
		super(name, price);
		this.expDate = expDate;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(expDate);
	}
}
