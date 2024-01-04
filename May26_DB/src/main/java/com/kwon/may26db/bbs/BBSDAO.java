package com.kwon.may26db.bbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import kiung.kwon.db.manager.KwonDBManager;

public class BBSDAO {
	private int allMsgCount;
	private int msgPerPage;

	private static final BBSDAO BDAO = new BBSDAO();

	private BBSDAO() {
		msgPerPage = 10;
	}

	public static BBSDAO getBdao() {
		return BDAO;
	}

	public void setAllMsgCount() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = KwonDBManager.connect("kwonPool");
			String sql = "select count(*) from may26_bbs";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			allMsgCount = rs.getInt("count(*)");
			System.out.println("전체 : " + allMsgCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
		KwonDBManager.close(con, pstmt, rs);
	}

	public void get(int page, HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = KwonDBManager.connect("kwonPool");

			int pageCount = (int) Math.ceil(allMsgCount / (double) msgPerPage);
			req.setAttribute("pageCount", pageCount);

			int start = (page - 1) * msgPerPage + 1;
			int end = msgPerPage * page;
			
			String sql 
					= "select * "
					+ "from ( "
					+ "	select rownum as rn, b_no, b_title, b_date "
					+ "	from ( "
					+ "		select b_no, b_title, b_date  "
					+ "		from may26_bbs "
					+ "		order by b_date desc "
					+ "	) "
					+ ") "
					+ "where rn >= ? and rn <= ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, start);			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();

			ArrayList<BBSMsg> msgs = new ArrayList<>();
			BBSMsg bm = null;
			while (rs.next()) {
				bm = new BBSMsg();
				bm.setNo(rs.getInt("b_no"));			
				bm.setTitle(rs.getString("b_title"));
				// bm.setTxt(rs.getString("b_txt"));
				bm.setDate(rs.getDate("b_date"));
				msgs.add(bm);
			}
			req.setAttribute("msgs", msgs);

		} catch (Exception e) {
			e.printStackTrace();
		}
		KwonDBManager.close(con, pstmt, rs);
	}

	public void write(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			// 연결
			con = KwonDBManager.connect("kwonPool");

			// 데이터 확보
			req.setCharacterEncoding("euc-kr");
			String title = req.getParameter("title");
			String txt = req.getParameter("txt");

			// sql(미완성 : 값 들어갈 자리에 ?, ;빼고)
			String sql = "insert into may26_bbs values(may26_bbs_seq.nextval, ?, ?, sysdate)";

			// 총괄매니저객체
			pstmt = con.prepareStatement(sql);

			// ? 채우기
			pstmt.setString(1, title);
			pstmt.setString(2, txt);

			// 실행
			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("result", "글쓰기 성공");
				allMsgCount++;
				System.out.println("쓰고 나면 : " + allMsgCount);
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("result", "글쓰기 실패");
		}
		KwonDBManager.close(con, pstmt, null);
	}
}
