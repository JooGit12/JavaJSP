import java.util.Scanner;

// DTO(Data Temp/Transfer Object)
// VO(Value Object)
// POJO(Plain Old Java Object)
// JavaBean
public class Guest {
	String name;
	double height;
	double weight;
	Scanner mouth = new Scanner(System.in);
	double bmi;
	String status;
	
	public String tellName() {
		return mouth.next();
	}

	public double tellHW() {
		return mouth.nextDouble();
	}

}
