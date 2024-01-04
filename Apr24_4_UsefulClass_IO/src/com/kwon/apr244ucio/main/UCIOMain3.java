package com.kwon.apr244ucio.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import com.kwon.apr244ucio.student.Student;

// 1) 그 csv읽어서 콘솔출력
// 2) 뜯고
// 3) 학생객체로
// 4) 출력을
//		이름 : 홍길동
//		생일 : 1999-03-01(수)
//		국어 : 100
//		영어 : 90
//		수학 : 80
//		평균 : 90.0
//		---------------------------
public class UCIOMain3 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream("C:/Kwon/student.csv");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr);
			
			String line = null;
			Student s = null;

			// Student[] students = new Student[????];
			while ((line = br.readLine()) != null) {
				s = new Student(line);
				s.printInfo();
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
