package com.kwon.may085ddp.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kiung.kwon.db.manager.KwonDBManager;

// MVC패턴인데
// DB에 연관된 작업을 하는 M을 DAO라고
// Data Access Object

// try-catch는 사수가 담당할 C쪽에 있는게 맞는데
//		1) MVC패턴 -> M의 결과가 V까지 가야
//		2) DB안되면 어차피 아무것도 안되는거 -> 대응방법이 어쩌고?
public class GiftDAO {

	public static String reg(Gift g) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = KwonDBManager.connect("jdbc:oracle:thin:@195.168.9.43:1521:xe", "kwon", "1");

			String sql = "insert into may08_gift values(?, ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, g.getName());
			pstmt.setInt(2, g.getPrice());

			if (pstmt.executeUpdate() == 1) {
				return "성공";
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return "실패";
		} finally {
			KwonDBManager.close(con, pstmt, null);
		}
	}
	
}
