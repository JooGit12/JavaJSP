import java.util.Scanner;

// recursive
//		원하는 값이 받아질때까지 계속 시킬때
public class FMain3 {
	public static int getEven() {
		Scanner k = new Scanner(System.in); // ???
		System.out.print("짝수 : ");
		int x = k.nextInt();
		return (x % 2 == 0) ? x : getEven();
	}

	public static void main(String[] args) {
		int x = getEven();
		System.out.println("-----");
		System.out.println(x);
	}
}
