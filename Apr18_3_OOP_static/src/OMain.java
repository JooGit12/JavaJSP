// 설계 	-번역(coding)-> 	.java
// .java 	-번역(compile)-> 	.class
// .class	-압축->				.jar
// .jar		-실행->
// ----------------------------------------
// JRE가 JVM을 실행하는 OS에 맞게 만들어 올리고 ->
// 프로그램 소스(기계어상태)가 stack에 깔리고 ->
// static멤버변수들 static영역에 만들고 ->
// JVM이 OMain.main(...)을 호출

// Java : Perfect한 OOL
// Python : Hybrid한 OOL 

public class OMain {
	public static void main(String[] args) {
		System.out.println(Gejang.PRODUCER);
		Gejang.test();
		System.out.println("-----");

		Gejang g1 = new Gejang();
		g1.name = "가정의달특별세트";
		g1.weight = 5;
		g1.price = 39900;
		g1.printInfo();
		System.out.println("-----");

		Gejang g2 = new Gejang();
		g2.name = "간장게장세트";
		g2.weight = 10;
		g2.price = 79900;
		g2.printInfo();
		System.out.println("-----");
		System.out.println(g1);
		System.out.println(g2);

		g1.name = "ㅋㅋㅋ";
		// g1.PRODUCER = "최수미";
		g1.printInfo();
		g2.printInfo();

	}
}
