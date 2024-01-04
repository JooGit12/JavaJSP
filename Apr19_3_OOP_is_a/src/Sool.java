
public class Sool extends Menu {
	double alcohol;
	
	public Sool() {
		// TODO Auto-generated constructor stub
	}
	
	public Sool(String name, int price, double alcohol) {
		super(name, price);
		this.alcohol = alcohol;
	}

	@Override
	public void show() {
		super.show();
		System.out.println(alcohol);
	}
}
