package com.kwon.may081jp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

// 이름 : 
// 가격 : 
// 성공
public class UpdateMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			// 연결
			String addr = "jdbc:oracle:thin:@195.168.9.43:1521:xe";
			con = DriverManager.getConnection(addr, "kwon", "1");
			
			// 데이터확보
			System.out.print("이름 : ");
			String name = k.next();
			System.out.print("얼마 : ");
			int price = k.nextInt();
			
			// sql(미완성)
			String sql = "update may08_gift "
					+ "set g_price = g_price + ? "
					+ "where g_name = ?";
			
			// 총괄객체
			pstmt = con.prepareStatement(sql);
			
			// sql완성
			pstmt.setInt(1, price);
			pstmt.setString(2, name);
			
			// 실행, 결과처리
			if (pstmt.executeUpdate() == 1) {
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






