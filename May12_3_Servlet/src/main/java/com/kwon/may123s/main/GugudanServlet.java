package com.kwon.may123s.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GugudanServlet")
public class GugudanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("euc-kr");

		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head><meta charset=\"EUC-KR\">");
		pw.print("<style type=\"text/css\">");
		pw.print("table { float: left; }");
		pw.print("</style>");
		pw.print("</head>");
		pw.print("<body>");
		for (int dan = 2; dan <= 9; dan++) {
			pw.print("<table border=\"1\" >");
			pw.printf("<tr><th>%d단</th></tr>", dan);
			for (int i = 1; i <= 9; i++) {
				pw.printf("<tr><td>%d x %d = %d</td></tr>", dan, i, dan * i);
			}
			pw.print("</table>");
		}
		pw.print("</body></html>");
	}

}




