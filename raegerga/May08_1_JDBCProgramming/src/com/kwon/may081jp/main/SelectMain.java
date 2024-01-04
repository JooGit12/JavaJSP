package com.kwon.may081jp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectMain {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 연결
			String addr = "jdbc:oracle:thin:@195.168.9.43:1521:xe";
			con = DriverManager.getConnection(addr, "kwon", "1");
			
			// 데이터확보
			
			// sql(미완성)
			String sql = "select * from may08_gift";
			
			// 총괄객체
			pstmt = con.prepareStatement(sql);
			
			// sql완성
			
			// 실행, 결과처리
			//		CUD : 영향받은 데이터 수
			// int row = pstmt.executeUpdate();
			//		R : 데이터
			rs = pstmt.executeQuery();
			
			// rs.next()
			//		다음 데이터로
			//		갔는데 없으면 false
			while (rs.next()) {
				// rs.getXXX("필드명") : 지금 보고있는 데이터의 그 필드 값 꺼내기
				System.out.println( rs.getString("g_name") );
				System.out.println( rs.getInt("g_price") );
				System.out.println("-----");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {rs.close();} catch (Exception e) {}
		try {pstmt.close();} catch (Exception e) {}
		try {con.close();} catch (Exception e) {}
	}
}
