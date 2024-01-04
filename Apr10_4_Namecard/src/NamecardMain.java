// 다 만들었으면 -> 최종 배포(export - Runnable JAR File)
//					압축파일의 일종 -> 알집이 열어버림
// 실행 명령어(java -jar 파일명)를 써서
// .bat로 만들기
public class NamecardMain {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("***********");
		System.out.println("* 권기웅\t\t*");
		System.out.println("***********");
		System.out.println("* 집\t\t:분당\t\t*");
		System.out.println("* 전화번호\t:01031544435\t*");
		System.out.println("***********");
		
		Thread.sleep(5000);
	}
}
