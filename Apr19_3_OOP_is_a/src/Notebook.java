public class Notebook extends Computer {
	double weight;
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(weight);
	}
}
