import java.util.Scanner;
// 논리연산자 : true/false나오는
//		이상	초과	이하	미만	같다	다르다
//		>=		>		<=		<		==		!=
// 
//		~고		~거나
//		&&		||	: 가망없으면 중간에 끊는
//		&		|	: 무식하게 끝까지 가는

// 	XOR(eXclusieve OR) : 배타적 OR
//	^

//	NOT : 반대
//	!

//	AND			OR			XOR			NOT
//	OO -> O		OO -> O		OO -> X		O -> X
//	OX -> X		OX -> O		OX -> O		X -> O
// 	XO -> X		XO -> O		XO -> O
//	XX -> X		XX -> X		XX -> X

public class OMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = k.next();
		
		System.out.print("키 : ");
		double height = k.nextDouble();
		
		System.out.print("몸무게 : ");
		double weight = k.nextDouble();
		
		System.out.print("나이 : ");
		int age = k.nextInt();
		
		System.out.println("-----");
		
		System.out.printf("%s, %.1fcm, %.1fkg\n", name, height, weight);
		
		// a : 키가 150이상
		boolean a = (height >= 150);
		System.out.println(a);
		
		// b : 몸무게가 50kg 미만
		boolean b = (weight < 50);
		System.out.println(b);
		
		// c : 나이가 5살
		boolean c = (age == 5);
		System.out.println(c);
		
		// d : 나이가 홀수
		boolean d = (age % 2 == 1);
		System.out.println(d);
		
		// e : 이름이 홍길동
		// boolean e = (name == "홍길동");
		boolean e = name.equals("홍길동");
		System.out.println(e);
		
		// &&쓸때는 확률 낮은 걸 앞으로 배치
		// f : 키가 100cm이상이고, 나이가 80살 이상
		// boolean f = (height >= 100) && (age >= 80);
		boolean f = (age >= 80) && (height >= 100);
		System.out.println(f);
	
		// ||쓸때는 확률 높은 걸 앞으로 배치
		// g : 키가 200cm이상이거나, 몸무게가 30kg이상
		// boolean g = (height >= 200) || (height >= 30);
		boolean g = (height >= 30) || (height >= 200);
		System.out.println(g);
		
		// 키가 150이상이든지, 나이가 10살이상이든지
		// 하나만 해
		boolean h = (height >= 150) ^ (age >= 10);
		System.out.println(h);
		
		// h못타는 사람만
		boolean i = !h;
		System.out.println(i);
		
		// 10 < 나이 < 20
		// boolean j = (10 < age < 20);
		// boolean j = (10 < age) && (age < 20);
		// boolean j = (age < 20) && (10 < age);
		boolean j = (age < 20) && (age > 10);
		System.out.println(j);
		
		// 키가 100cm이상이고, 키가 150cm이상만 타는
		boolean l = (height >= 150);
		System.out.println(l);
	}
}




