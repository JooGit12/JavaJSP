import java.util.Scanner;

public class CSMain3 {
	public static String getName() {
		Scanner k = new Scanner(System.in);
		System.out.print("이름 : ");
		return k.next();
	}

	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("키(m) : ");
		double h = k.nextDouble();
//		if (h > 3) {
//			return h / 100;
//		} else {
//			return h;
//		}
		return (h > 3) ? (h / 100) : h;
		// return (h > 3) ? getHeight() : h;
	}

	public static double getWeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("몸무게(kg) : ");
		return k.nextDouble();
	}

	public static double calcBMI(double w, double h) {
		return w / (h * h);
	}

	public static String judge(double b) {
		if (b >= 35) {
			return "고도 비만"; // 값 주고 함수 끝
		} 
		if (b >= 30) {
			return "중도 비만";
		}
		if (b >= 25) {
			return "경도 비만";
		}
		if (b >= 23) {
			return "과체중";
		}
		if (b >= 18.5) {
			return "정상";
		}
		return "저체중";
	}
	public static void printResult(double b, String r, String n) {
		System.out.printf("BMI : %.1f\n", b);
		System.out.printf("%s씨는 %s\n", n, r);
	}
	public static void main(String[] args) {
		String name = getName();
		double height = getHeight();
		double weight = getWeight();
		double bmi = calcBMI(weight, height);
		String result = judge(bmi);
		printResult(bmi, result, name);
	}
}
