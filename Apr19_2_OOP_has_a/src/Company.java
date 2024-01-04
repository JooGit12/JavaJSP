
public class Company {
	String name;
	int employeeCount;
	Human ceo;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(String name, int employeeCount, Human ceo) {
		super();
		this.name = name;
		this.employeeCount = employeeCount;
		this.ceo = ceo;
	}
	
	public void show() {
		System.out.println(name);
		System.out.println(employeeCount);
		ceo.showInfo();
	}
}
