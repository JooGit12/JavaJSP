package com.kwon.apr244ucio.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class UCIOMain_FileRead {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			// 생성자에 인코딩방식 쓰게 해놨으면
			// InputStreamReader개조형(2bytes) : 이미 깨놨음
			// FileReader fr = new FileReader("C:\\Kwon/apr24.txt");
			
			// InputStream개조형(1byte)
			FileInputStream fis = new FileInputStream("C:\\Kwon/apr24.txt");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr);
			
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
