package com.kwon.may152io.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Output")
public class Output extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("euc-kr");

		String id = request.getParameter("id");
		
		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head><meta charset=\"EUC-KR\">");
		pw.print("<style type=\"text/css\">");
		pw.print("</style>");
		pw.print("</head>");
		pw.print("<body>");
		pw.printf("<h1>ID : %s</h1>", id);

		pw.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setCharacterEncoding("euc-kr");

		String id = request.getParameter("id");
		String pwd = request.getParameter("pw");
		String gender = request.getParameter("gender");
		String a = request.getParameter("addrrr");
		// checkbox만
		String[] t = request.getParameterValues("tonghak");
		String[] h = request.getParameterValues("hobby");
		
		// textarea에서 엔터치면 : \r\n
		// 웹사이트의 줄바꿈 : <br>
		// java쪽에서 쓸거면 그대로, web쪽에서 쓸거면 \r\n -> <br>
		String i = request.getParameter("introduce");
		i = i.replace("\r\n", "<br>");
		
		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head><meta charset=\"EUC-KR\">");
		pw.print("<style type=\"text/css\">");
		pw.print("</style>");
		pw.print("</head>");
		pw.print("<body>");
		pw.printf("<h1>ID : %s</h1>", id);
		pw.printf("<h1>PW : %s</h1>", pwd);
		pw.printf("<h1>성별 : %s</h1>", gender);
		pw.printf("<h1>주소 : %s</h1>", a);
		pw.printf("<h1>자기소개 : %s</h1>", i);

		// 아무것도 선택 안하면 배열의 length가 0이 아니고
		// 배열 자체가 null인거
		if (t != null) {
			pw.print("<h1>통학수단</h1>");
			for (String s : t) {
				pw.print(s + "<br>");
			}
		}
		
		if (h != null) {
			pw.print("<h1>취미</h1>");
			for (String s : h) {
				pw.print(s + " ");
			}
		}
		
		
		pw.print("</body></html>");
	}

}
