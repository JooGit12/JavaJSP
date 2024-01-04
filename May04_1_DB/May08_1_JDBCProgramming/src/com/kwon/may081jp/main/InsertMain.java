package com.kwon.may081jp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null; // DB관련 작업을 다 해주는 총괄매니저 객체
		try {
			// 연결
			String addr = "jdbc:oracle:thin:@195.168.9.43:1521:xe";
			con = DriverManager.getConnection(addr, "kwon", "1");
			
			// 데이터 확보
			System.out.print("이름 : ");	
			String n = k.next();
			System.out.print("가격 : ");	
			int p = k.nextInt();
			
			// SQL(미완성)
			//		값 들어갈 자리에 ?(따옴표 빼고)
			//		SQL자체에 있는 ;빼고
			String sql = "insert into may08_gift values(?, ?)";
			
			// SQL완성, 전송, 결과처리 해주는 총괄매니저 객체
			pstmt = con.prepareStatement(sql);
			
			// SQL완성(? 채우기)
			pstmt.setString(1, n); // pstmt.setXXX(번호, 값);
			pstmt.setInt(2, p);
			
			// 서버로 전송, 실행, 결과받기
			int row = pstmt.executeUpdate();
			
			if (row == 1) {
				System.out.println("성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {pstmt.close();} catch (Exception e) {}
		try {con.close();} catch (Exception e) {}
		k.close();
	}
}
// 종로코아빌딩 > 9층 > 903호 > 가방 > 도시락






