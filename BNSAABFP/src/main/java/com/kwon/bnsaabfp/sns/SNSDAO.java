package com.kwon.bnsaabfp.sns;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import com.kwon.bnsaabfp.member.Member;

import kiung.kwon.db.manager.KwonDBManager;

public class SNSDAO {
	private int allMsgCount;
	private String[] colors;
	private Random colorSelector;
	private static final SNSDAO SDAO = new SNSDAO();

	public static SNSDAO getSdao() {
		return SDAO;
	}

	private SNSDAO() {
		colors = new String[] { "#E57373", "#BA68C8", "#F06292", "#9575CD", "#7986CB", "#64B5F6", "#4FC3F7", "#4DD0E1",
				"#4DB6AC", "#81C784", "#AED581", "#DCE775", "#FFF176", "#FFD54F", "#FFB74D", "#FF8A65", "#A1887F",
				"#E0E0E0", "#90A4AE" };
		colorSelector = new Random();
	}

	public void clearSearchMsg(HttpServletRequest req) {
		req.getSession().setAttribute("search", null);
	}

	public void deleteMsg(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = KwonDBManager.hi("kwonPool");

			int no = Integer.parseInt(req.getParameter("no"));

			String sql = "delete from bnsaabfp_sns where s_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);

			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "글 삭제 성공");
				allMsgCount--;
			} else {
				req.setAttribute("r", "글 삭제 실패");
			}
		} catch (Exception e) {
			req.setAttribute("r", "글 삭제 실패");
		}
		KwonDBManager.bye(con, pstmt, null);
	}

	public void deleteReply(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = KwonDBManager.hi("kwonPool");

			int no = Integer.parseInt(req.getParameter("no"));

			String sql = "delete from bnsaabfp_sns_reply where sr_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);

			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "댓글 삭제 성공");
			} else {
				req.setAttribute("r", "댓글 삭제 실패");
			}
		} catch (Exception e) {
			req.setAttribute("r", "댓글 삭제 실패");
		}
		KwonDBManager.bye(con, pstmt, null);
	}

	public int getMemberMsgCount(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = KwonDBManager.hi("kwonPool");
			String sql = "select count(*) " + "from bnsaabfp_sns " + "where s_owner = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			rs.next();
			return rs.getInt("count(*)");
		} catch (Exception e) {
			return 0;
		} finally {
			KwonDBManager.bye(con, pstmt, rs);
		}
	}

	public void getMsg(int page, HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = KwonDBManager.hi("kwonPool");

			// setAllMsgCount();

			int msgPerPage = 10;
			int msgCount = allMsgCount;
			String search = (String) req.getSession().getAttribute("search");
			if (search == null) {
				search = "";
			} else {
				msgCount = getSearchMsgCount(search);
			}
			int pageCount = (int) Math.ceil(msgCount / (double) msgPerPage);
			int start = (page - 1) * msgPerPage + 1;
			int end = page * msgPerPage;

			req.setAttribute("pageCount", pageCount);
			req.setAttribute("page", page);

			String sql = "select * " + "from ("
					+ "	select rownum as rn, m_photo, s_no, s_owner, s_date, s_txt, s_color " + "	from ( "
					+ "		select m_photo, s_no, s_owner, s_date, s_txt, s_color "
					+ "		from bnsaabfp_member, bnsaabfp_sns "
					+ "		where m_id = s_owner and (s_txt like '%'||?||'%' or s_owner like '%'||?||'%')"
					+ "		order by s_date desc " + "	) " + ") " + "where rn >= ? and rn <= ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, search);
			pstmt.setString(2, search);
			pstmt.setInt(3, start);
			pstmt.setInt(4, end);
			rs = pstmt.executeQuery();

			ArrayList<SNSMsg> msgs = new ArrayList<SNSMsg>();
			SNSMsg sm = null;
			while (rs.next()) {
				sm = new SNSMsg();
				sm.setOwnerPhoto(rs.getString("m_photo"));
				sm.setNo(rs.getInt("s_no"));
				sm.setOwner(rs.getString("s_owner"));
				sm.setDate(rs.getDate("s_date"));
				sm.setTxt(rs.getString("s_txt"));
				sm.setColor(rs.getString("s_color"));
				sm.setReplys(getReplys(rs.getInt("s_no")));
				msgs.add(sm);
			}
			req.setAttribute("msgs", msgs);
		} catch (Exception e) {
		}
		KwonDBManager.bye(con, pstmt, rs);
	}

	private ArrayList<SNSReply> getReplys(int s_no) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = KwonDBManager.hi("kwonPool");
			String sql = "select * from bnsaabfp_sns_reply " + "where sr_s_no = ? " + "order by sr_date";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, s_no);
			rs = pstmt.executeQuery();
			ArrayList<SNSReply> replys = new ArrayList<SNSReply>();
			while (rs.next()) {
				replys.add(new SNSReply(rs.getInt("sr_no"), rs.getString("sr_owner"), rs.getString("sr_txt"),
						rs.getDate("sr_date"), s_no));
			}
			return replys;
		} catch (Exception e) {
			return null;
		} finally {
			KwonDBManager.bye(con, pstmt, rs);
		}
	}

	private int getSearchMsgCount(String search) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = KwonDBManager.hi("kwonPool");
			String sql = "select count(*) " + "from bnsaabfp_sns "
					+ "where s_txt like '%'||?||'%' or s_owner like '%'||?||'%'";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, search);
			pstmt.setString(2, search);
			rs = pstmt.executeQuery();
			rs.next();
			return rs.getInt("count(*)");
		} catch (Exception e) {
			return 0;
		} finally {
			KwonDBManager.bye(con, pstmt, rs);
		}
	}

	public void searchMsg(HttpServletRequest req) {
		String txt = req.getParameter("txt");
		// 검색은 나만
		// 검색한게 페이지 이동[요청]해도 남아있어야
		req.getSession().setAttribute("search", txt);
	}

	public void setAllMsgCount() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = KwonDBManager.hi("kwonPool");
			String sql = "select count(*) from bnsaabfp_sns";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			allMsgCount = rs.getInt("count(*)");
		} catch (Exception e) {
		}
		KwonDBManager.bye(con, pstmt, rs);
	}

	public void setAllMsgCount(int count) {
		allMsgCount -= count;
	}

	public void updateMsg(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = KwonDBManager.hi("kwonPool");

			int no = Integer.parseInt(req.getParameter("no"));
			String txt = req.getParameter("txt");

			String sql = "update bnsaabfp_sns set s_txt = ? where s_no = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, txt);
			pstmt.setInt(2, no);

			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "글 수정 성공");
			} else {
				req.setAttribute("r", "글 수정 실패");
			}
		} catch (Exception e) {
			req.setAttribute("r", "글 수정 실패");
		}
		KwonDBManager.bye(con, pstmt, null);
	}

	public void writeMsg(HttpServletRequest req) {
		// 새로고침 : 방금전에 했던 요청 똑같이 다시
		// 14:30:01 - 첫 글쓰기[C?txt=ㅋㅋㅋ&token=143001]
		// token = 143001
		// lastToken = null
		// 성공 -> successToken = 143001
		// -----------------------
		// 14:31:01 - 두번째 글쓰기[C?txt=ㅋㅋㅋ&token=143101]
		// token = 143101
		// lastToken = 143001
		// 성공 -> successToken = 143101
		// -----------------------
		// 14:32:50 - 새로고침[C?txt=ㅋㅋㅋ&token=143101]
		// token = 143101
		// lastToken = 143101
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = KwonDBManager.hi("kwonPool");

			req.setCharacterEncoding("euc-kr");
			String token = req.getParameter("token");
			String lastToken = (String) req.getSession().getAttribute("successToken");

			if (lastToken != null && token.equals(lastToken)) {
				req.setAttribute("r", "글쓰기 실패[새로고침]");
				return;
			}

			Member m = (Member) req.getSession().getAttribute("loginMember");
			String owner = m.getId();
			String txt = req.getParameter("txt").replace("\r\n", "<br>");
			String color = colors[colorSelector.nextInt(colors.length)];

			String sql = "insert into bnsaabfp_sns values(bnsaabfp_sns_seq.nextval, ?, ?, sysdate, ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, owner);
			pstmt.setString(2, txt);
			pstmt.setString(3, color);

			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "글쓰기 성공");
				req.getSession().setAttribute("successToken", token);
				allMsgCount++;
			} else {
				req.setAttribute("r", "글쓰기 실패");
			}
		} catch (Exception e) {
			req.setAttribute("r", "글쓰기 실패");
		} finally {
			KwonDBManager.bye(con, pstmt, null);
		}
	}

	public void writeReply(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = KwonDBManager.hi("kwonPool");

			String token = req.getParameter("token");
			String lastToken = (String) req.getSession().getAttribute("successToken");

			if (lastToken != null && token.equals(lastToken)) {
				req.setAttribute("r", "댓글 쓰기 실패[새로고침]");
				return;
			}

			Member m = (Member) req.getSession().getAttribute("loginMember");
			String txt = req.getParameter("txt");
			int s_no = Integer.parseInt(req.getParameter("s_no"));

			String sql = "insert into bnsaabfp_sns_reply values(bnsaabfp_sns_reply_seq.nextval, ?, ?, sysdate, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, txt);
			pstmt.setInt(3, s_no);

			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "댓글쓰기 성공");
				req.getSession().setAttribute("successToken", token);
			} else {
				req.setAttribute("r", "댓글쓰기 실패");
			}
		} catch (Exception e) {
			req.setAttribute("r", "댓글쓰기 실패");
		} finally {
			KwonDBManager.bye(con, pstmt, null);
		}
	}

}
