package com.kwon.may162vc.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
// 서블릿 : 파일업로드해야하고, 계산해야하고, ...

// 잘못입력해도 일단 서블릿까지 와서 try/if
//		입력 유효성 검사까지 굳이 서블릿에서? -> 아쉽
// 잘못입력하면 아예 서블릿까지 오지도 않게 - v
//		=> 입력유효성검사를 사용자쪽에서 하자
@WebServlet("/O")
public class O extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			response.setCharacterEncoding("euc-kr");

			MultipartRequest mr = new MultipartRequest(request,
					request.getSession().getServletContext().getRealPath("p"), 5242880, "euc-kr",
					new DefaultFileRenamePolicy());

			String name = mr.getParameter("n");
			int age = Integer.parseInt(mr.getParameter("a"));
			String say = (age >= 20) ? "어서오세요" : "나가";

			String fName = URLEncoder.encode(mr.getFilesystemName("p"), "euc-kr").replace("+", " ");

			PrintWriter pw = response.getWriter();
			pw.print("<html>");
			pw.print("<head><meta charset=\"EUC-KR\">");
			pw.print("</head>");
			pw.print("<body>");
			pw.printf("<h1>%s</h1>", name);
			pw.printf("<img src=\"p/%s\">", fName);
			pw.printf("<h3>%s</h3>", say);
			pw.print("</body></html>");
		} catch (Exception e) {
			PrintWriter pw = response.getWriter();
			pw.print("<html>");
			pw.print("<head><meta charset=\"EUC-KR\">");
			pw.print("</head>");
			pw.print("<body>");
			pw.print("<h1>나이...</h1>");
			pw.print("</body></html>");
		}
	}

}
