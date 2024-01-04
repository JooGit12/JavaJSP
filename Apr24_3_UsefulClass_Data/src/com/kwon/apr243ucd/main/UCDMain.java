package com.kwon.apr243ucd.main;

import java.util.Scanner;
import java.util.StringTokenizer;

// 숫자(x,y,z,...) : 
// -------------------
// 합계

// 1) 숫자만 쓴다치고 합계 내고
// 2) 글자들어온거 처리
public class UCDMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("숫자(x,y,...) : ");
		String data = k.next();

		StringTokenizer st = new StringTokenizer(data, ",");
		int hab = 0;
		while (st.hasMoreTokens()) {
			try {
				hab += Integer.parseInt(st.nextToken());
			} catch (Exception e) {
			}
		}
		System.out.println(hab);
	}
}
