import java.util.Scanner;

// 조건문 
//		if - else if - else
//		switch - case

//		switch (대상) {
//		case 값A:
//			대상이 값A면 할 일
//			break;
//		case 값B:
//			대상이 값B면 할 일
//			break;
//		...
//		default:
//			위에 해당사항 없을때 할 일
//			break;
//		}
public class CSMain5 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = k.nextInt();
		System.out.println("-----");
		System.out.println(age);

		// 가독성이 이상한데
		// 조건식 못 씀
		// => if문보다 하위호환같은데...
		switch (age) {
		case 80:
			System.out.println("어서옵쇼 어르신");
			// break;
		case 20:
			System.out.println("어서와요");
			break;
		default:
			System.out.println("가");
			break;
		}

	}
}
