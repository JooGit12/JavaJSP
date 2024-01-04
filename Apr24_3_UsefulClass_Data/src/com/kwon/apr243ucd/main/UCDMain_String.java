package com.kwon.apr243ucd.main;

import java.util.StringTokenizer;

// 수정이 불가능한 문자열 객체
public class UCDMain_String {
	public static void main(String[] args) {
		// String s = new String("ㅋ");
		String s = "좀 다르게 씁시다 ㅋ 말고";
		
		// s가 ㅋ로 시작하나
		System.out.println(s.startsWith("ㅋ"));
		
		// s 글자수
		System.out.println(s.length());
		
		// 3번째 글자
		System.out.println(s.charAt(2));
		
		// ㅋ는 몇번째에
		System.out.println(s.indexOf("ㅋ"));
		
		// 말고 -> 도 좋고
		System.out.println(s.replace("말고", "도 좋고"));
		
		// 3번째 ~ 6번째까지
		System.out.println(s.substring(2, 6));
		
		// 문자열 객체를 만들면서 %d쓰려면
		String s2 = String.format("%.1f", 1123.23123123123);
		System.out.println(s2);
		System.out.println("----------");
		
		// 문자열 붙이기 - x
		String s3 = "ㅋㅋㅋ";
		s3 = s3.concat("ㅎㅎㅎ"); 	// 뒤에다 ㅎㅎㅎ
		s3 += "ㄱㄱ";				// 뒤에다 ㄱㄱ
		System.out.println(s3);
		
		// 문자열 대량으로 붙이기
		StringBuffer sb = new StringBuffer();
		sb.append("ㅋㅋㅋ");
		sb.append("ㅎㅎㅎ");
		sb.append("ㄱㄱㄱ");
		String s4 = sb.toString();
		System.out.println(s4);
		
		// 문자열 분리하기
		// 데이터 받아오면 String한덩어리
		// 정형데이터 : 1번위치에 기온
		String s5 = "맑음,20.0,15.3";
		String[] s55 = s5.split(","); // 정형데이터에 유리
		System.out.println(s55[1]);
	
		// 비정형데이터 : 2번위치가 뭐...
		String s6 = "조조가 밥을 먹어요";
		StringTokenizer st = new StringTokenizer(s6, " "); // 비정형데이터에 유리
		//System.out.println(st.nextToken());
		//System.out.println(st.nextToken());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}




