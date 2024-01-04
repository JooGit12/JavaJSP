package com.kwon.may081jp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 원래는 OracleDB접속하려면 SQLPlus라는 프로그램으로
// 근데 SQLPlus가 cmd기반이라서 -> 불편
// 그래서 SQLPlus말고 EclipseIDE로 OracleDB접속해서 제어하자

// OracleDB와 연동된 프로그램 만들자
// 프로그램 != Eclipse

// 옛날 : Oracle사의 OracleDB, Sun사의 Java
// 지금 : Oracle사의 OracleDB, MySQL, Java
// => 이제는 Java에 OracleDriver가 내장될만...

// DB메이커가 다양한데 통신방식이 다 다름
// Java입장에서 어떻게 다 만들어주나 -> 내장된게 없음
// 각 DB회사에서 만들어줬을것
// => OracleDB는 ojdbc8.jar(ojdbc14.jar(JDK1.4용))
public class ConnectMain {
	public static void main(String[] args) {
		
		Connection con = null;
		try {
			// 다양한 DB들 통신방식은 같은데, 드라이버가 다 다름
			// 옛날 : 연결할때 OracleDriver 쓰라고
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			// 지금 : 주소 보고 맞는 드라이버 알아서 찾아 씀
			
			// 주소(DB메이커별로 형식이 다 다름)
			String addr = "jdbc:oracle:thin:@195.168.9.43:1521:xe";
		
			// 연결
			con = DriverManager.getConnection(addr, "kwon", "1");
			System.out.println("성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}


