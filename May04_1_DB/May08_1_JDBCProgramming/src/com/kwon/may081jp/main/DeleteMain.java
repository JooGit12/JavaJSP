package com.kwon.may081jp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kiung.kwon.db.manager.KwonDBManager;

public class DeleteMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			// 연결
			con = KwonDBManager.connect("jdbc:oracle:thin:@195.168.9.43:1521:xe", "kwon", "1");
			
			// 데이터확보
			System.out.print("이름 : ");
			String name = k.next();
			
			// sql(미완성)
			String sql = "delete from may08_gift where g_name like '%'||?||'%'";
			
			// 총괄객체
			pstmt = con.prepareStatement(sql);
			
			// sql완성
			pstmt.setString(1, name);
			
			// 실행, 결과처리
			if (pstmt.executeUpdate() == 1) {
				System.out.println("성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		KwonDBManager.close(con, pstmt, null);
		k.close();
	}
}
