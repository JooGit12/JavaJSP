import java.util.Scanner;

// 한국어로 설계 -번역(개발)-> 		.java
// .java         -번역(compile)-> 	.class
// .class		 -압축->			.jar(Java ARchive)

// 실행 : cmd 가서
//		java   -jar   파일명
//		인데
//		실행 편하게 하려면 .bat파일 만들어주면 됨

public class OMain4 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = k.next();
		
		System.out.print("키 : ");
		double height = k.nextDouble();
		
		System.out.print("몸무게 : ");
		double weight = k.nextDouble();
		
		System.out.println("-----");
		
		double stdWeight = (height - 100) * 0.9;
		double bimando = (weight / stdWeight) * 100;
		String result = (bimando > 120) ? "비만" : "정상";
		
		System.out.printf("표준체중 : %.1fkg\n", stdWeight);
		System.out.printf("비만도 : %.1f%%\n", bimando);
		System.out.printf("%s씨는 %s\n", name, result);
		
		System.out.print("종료하려면 뭐라도 써 : ");
		String s = k.next();
	}
}




