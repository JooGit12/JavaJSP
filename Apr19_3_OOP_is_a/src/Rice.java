
public class Rice extends Menu {
	int spicy;

	public Rice() {
		// TODO Auto-generated constructor stub
	}

	public Rice(String name, int price, int spicy) {
		super(name, price);
		this.spicy = spicy;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println(spicy);
	}
	
	
}
