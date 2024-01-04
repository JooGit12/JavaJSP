//	Java프로그램 실행 명령어
//		java  -jar  파일명
//		인데
//		java  -jar  파일명   aaa  bbb  ccc
//		=> aaa bbb ccc가 args쪽으로 들어감

// 빅데이터면 서버급컴 여러대로 병렬처리
//	PC에서 eclipse로 분석 프로그램을 만들어서
//	그 프로그램을 서버급컴으로 보내서 실행하는데
//	그때 유용
public class AMain2 {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		Thread.sleep(5000);
	}
}
