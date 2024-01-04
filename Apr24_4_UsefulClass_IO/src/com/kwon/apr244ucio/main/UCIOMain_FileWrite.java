package com.kwon.apr244ucio.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class UCIOMain_FileWrite {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("뭐 : ");
		String s = k.next();
		System.out.println("-----");
		System.out.println(s);
		
		// 파일에 쓰기 편하게 OutputStreamWriter개조해놓은
		// 파일은 없으면 만들어 줌, 폴더는 x
		//
		// Windows : \
		// Linux : /
		// Windows에서도 리눅스처럼 /써도 인식함
		
		// \r : 커서 맨 앞으로
		// \n : 줄만 바꾸기
		// Win7까지의 메모장 \n만 있으면 깨짐

		// 빨대시스템은 다 썼으면 빨리 치워야
		// 그래야 다른프로그램에서 빨대를 쓸 수가
		// fw위에 덮어씌워놓은 bw, 연관된것 중에는 하나만 닫으면 다 처리됨
		BufferedWriter bw = null;
		try {
			// OutputStreamWriter개조형(2bytes) : 이미 글자단위
			//	=> 인코딩방식이고뭐고 지정할 새도 없이 글자를 읽어놨
			// 	=> 이미 깨졌음
			// FileWriter fw = new FileWriter("C:\\Kwon/apr24.txt", true);
			
			// OutputStream개조형(1byte)
			FileOutputStream fos = new FileOutputStream("C:\\Kwon/apr24.txt", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);
			bw.write(s + "\r\n");
			bw.flush(); // 빨대 용량 꽉 안차도 강제 전송
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}





