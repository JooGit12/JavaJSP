
public class Weather {
	// 1. 멤버변수(직접 타이핑)
	double temp;
	double humi;

	// 2. 생성자시리즈
	// 2-1. 기본 생성자(ctrl + space)
	public Weather() {
		// TODO Auto-generated constructor stub
	}

	// 2-2. 오버로딩된 생성자(ctrl + shift + a)
	public Weather(double temp, double humi) {
		super();
		this.temp = temp;
		this.humi = humi;
	}

	// 3. 일반 메소드
	public void print() {
		System.out.println(temp);
		System.out.println(humi);
	}
}
