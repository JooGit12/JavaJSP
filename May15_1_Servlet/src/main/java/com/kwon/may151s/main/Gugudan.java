package com.kwon.may151s.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Gugudan")
public class Gugudan extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    // http://localhost/May15_1_Servlet/Gugudan?dan=5
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("euc-kr");

		int d = Integer.parseInt(request.getParameter("dan"));
		
		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head><meta charset=\"EUC-KR\">");
		pw.print("<style type=\"text/css\">");
		pw.print("</style>");
		pw.print("</head>");
		pw.print("<body>");
		pw.print("<table border=\"1\" >");
		pw.printf("<tr><th>%d단</th></tr>", d);
		for (int i = 1; i <= 9; i++) {
			pw.printf("<tr><td>%d x %d = %d</td></tr>", d, i, d * i);
		}
		pw.print("</table>");
		pw.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
