public class OMain2 {
	public static void main(String[] args) {
		Calculator.printHab(30, 10);
		
		System.out.println("-----");
		
		PC pc1 = new PC();
		pc1.ram = 32;
		pc1.printInfo();
		System.out.println("-----");
		
		PC pc2 = new PC();
		pc2.printInfo();
		
	}
}
