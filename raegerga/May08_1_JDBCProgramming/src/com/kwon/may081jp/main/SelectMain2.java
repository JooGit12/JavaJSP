package com.kwon.may081jp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

// 이름 : 디
// 
public class SelectMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 연결
			String addr = "jdbc:oracle:thin:@195.168.9.43:1521:xe";
			con = DriverManager.getConnection(addr, "kwon", "1");
			
			// 데이터확보
			System.out.print("이름 : ");
			String n = k.next();
			
			// sql(미완성)
			String sql = "select avg(g_price) "
					+ "from may08_gift "
					+ "where g_name like '%'||?||'%'";
			
			// 총괄객체
			pstmt = con.prepareStatement(sql);
			
			// sql완성
			pstmt.setString(1, n);
			
			// 실행, 결과처리
			rs = pstmt.executeQuery();
			rs.next();
			System.out.println( rs.getDouble("avg(g_price)") );
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {rs.close();} catch (Exception e) {}
		try {pstmt.close();} catch (Exception e) {}
		try {con.close();} catch (Exception e) {}
		k.close();
	}
}
