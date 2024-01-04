package com.kwon.may151s.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Door")
public class Door extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// 인터넷 주소에 한글-x
	//		ㅋ -> %2A
	
	// GET : 홍길동 -> %2A -> 주소에 실려서 전달
	// POST : 홍길동 -> 그냥 내부적으로 전달
	
	// Tomcat이 자동으로 함(iso-8859-1이던가...)
	//	ㅋ -> %2A -> ㅋ
	
	// 주소 직접 쳐서
	// <a>눌러서
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 사용자가 euc-kr방식으로 요청했음
		// request.setCharacterEncoding("euc-kr");
		// Tomcat설정을 바꿔서 euc-kr로 하도록(server.xml 63번줄)
		
		// euc-kr로 응답
		response.setCharacterEncoding("euc-kr");

		String n = request.getParameter("nameee");
		int a = Integer.parseInt(request.getParameter("aaage"));
		String say = (a >= 20) ? "어서오세요" : "나가";

		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head><meta charset=\"EUC-KR\">");
		pw.print("<style type=\"text/css\">");
		pw.print("</style>");
		pw.print("</head>");
		pw.print("<body>");
		pw.printf("<h1>%s씨</h1>", n);
		pw.printf("<h1>%s</h1>", say);
		pw.print("</body></html>");
	}

	// GET방식 요청 : request parameter가 주소에
	// POST방식 요청 : request parameter가 내부적으로 전달

	// POST방식 요청 받으면(form method="post")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 사용자가 euc-kr방식으로 요청했음
		request.setCharacterEncoding("euc-kr");
		// euc-kr로 응답
		response.setCharacterEncoding("euc-kr");

		String n = request.getParameter("nameee");
		int a = Integer.parseInt(request.getParameter("aaage"));
		String say = (a >= 20) ? "어서오세요" : "나가";

		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head><meta charset=\"EUC-KR\">");
		pw.print("<style type=\"text/css\">");
		pw.print("</style>");
		pw.print("</head>");
		pw.print("<body>");
		pw.printf("<h1>%s씨</h1>", n);
		pw.printf("<h1>%s</h1>", say);
		pw.print("</body></html>");
	}

}
