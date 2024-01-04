package com.kwon.may082aop.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kiung.kwon.db.manager.KwonDBManager;

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
			con = KwonDBManager.connect("jdbc:oracle:thin:@195.168.9.43:1521:xe", "kwon", "1");
			
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
		KwonDBManager.close(con, pstmt, rs);
		k.close();
	}
}
