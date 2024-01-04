package com.kwon.apr244ucio.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
// 인코딩방식이 여러종류
//	 ㅋ -encoding-> 10110 -decoding-> ㅋ
//		ㅋ -A-> 11111 -A-> ㅋ
//		ㅋ -B-> 01011 -B-> ㅋ
//		ㅋ -C-> 00001 -A-> 깨짐
// 전세계적으로 가장 많이 : utf-8
// 국내 랭킹 2위 : euc-kr
// ------------------------------------------------------
// 확장자 : 윈도우 진영에만 있는 허상
//			뭔지 알기 편할 뿐
// aaaa.txt : 메모장에서 열면 잘 열리는 파일
// bbbb.hwp : 한글에서 열면 잘 열리는 파일
// cccc.xls : 엑셀에서 열면 잘 열리는 파일

// .csv(comma separated value)
//		각 값들이 ,로 구분된 파일
//		그렇게 규칙적이니 엑셀에서 잘 여는데
// 		엑셀이 utf-8인식못함
public class UCIOMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = k.next();
		System.out.print("생일 : ");
		String birthday = k.next();
		System.out.print("국어 : ");
		int kor = k.nextInt();
		System.out.print("영어 : ");
		int eng = k.nextInt();
		System.out.print("수학 : ");
		int mat = k.nextInt();

		// win : 경로에 대소문자 구별x
		// linux : 구별
		BufferedWriter bw = null;
		try {
			FileOutputStream fos = new FileOutputStream("C:/Kwon/student.csv", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);

			String data = String.format("%s,%s,%d,%d,%d\r\n", name, birthday, kor, eng,mat);
			bw.write(data);
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
