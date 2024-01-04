package kiung.kwon.db.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// AOP를 적용해서
// 어차피 앞으로 만들게 될 프로그램들은 DB연결 다 할거고
// DB관련된 기능들 여기다 다 정리해서
// 이거 갖고 다니면서(회사가서도) 쓰겠다
// => library를 만들겠다
//		모든 상황에 다 대응할 수 있도록 최대한 일반적으로 만들어야
public class KwonDBManager {
	public static Connection connect(String url, String id, String pw) throws SQLException {
		return DriverManager.getConnection(url, id, pw);
	}

	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		// insert때는 rs가 없어서 -> NullPointerException이 생길텐데
		try {
			rs.close();
		} catch (Exception e) {
		}
		try {
			pstmt.close();
		} catch (Exception e) {
		}
		try {
			con.close();
		} catch (Exception e) {
		}
	}
}
