package com.kwon.may172j.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/O")
public class O extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("euc-kr");

		String xxx = request.getParameter("xx");
		int xxxx = Integer.parseInt(xxx);
		
		int yyyy = Integer.parseInt(request.getParameter("yy"));
		
		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head><meta charset=\"EUC-KR\">");
		pw.print("</head>");
		pw.print("<body>");
		pw.printf("<h1>%d</h1>", xxxx + yyyy);
		pw.printf("<h1>%d</h1>", xxxx - yyyy);
		pw.printf("<h1>%d</h1>", xxxx * yyyy);
		pw.printf("<h1>%d</h1>", xxxx / yyyy);
		pw.print("</body></html>");
	}

}
