public class PrintMain2 {
	public static void main(String[] args) {
		// 콘솔창에 이름 출력하고 줄 바꾸기
		System.out.println("권기웅");

		// 거기는 가볍게 중간결과 확인하는 콘솔창
		// 나중에 통신, 파일처리에서는 문제 생김
		// \n : new line - 줄바꾸기
		// \r : carriage return - 커서를 맨 앞으로
		System.out.println("ㅋㅋㅋ\nㅎㅎㅎ");
		System.out.println("ㅡㅡ\rㅠㅠ");
		// 제대로 줄 바꾸기
		System.out.println("ㅇㅇ\r\nㅎㅇ");
		System.out.println("-----");
		
		// \t : tab
		System.out.println("ㅌㅌ\tㄱㄱ");
		System.out.println("ㅌㅌㅌ\tㄱㄱ");
		System.out.println("-----");
		
		// \b : backspace(1byte지우기)
		// Java : 1글자에 2bytes
		// => Java에서는 써먹기가...
		System.out.println("ㅎ\b");
		System.out.println("-----");
		
		// \\ : \표현
		System.out.println("\\(^.^)/");

		// \" : "표현
		System.out.println("\"");
	}
}


