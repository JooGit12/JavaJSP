package com.kwon.may123s.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 인터넷 -> HTTP통신 : 클라이언트가 요청하면 서버가 응답

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	// 클에게 GET방식 요청 받으면
	//		직접 주소쳐서 
	//		<a>눌러서
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// euc-kr방식으로 응답하겠다
		response.setCharacterEncoding("euc-kr");
		
		// 서버-클라이언트를 연결하는 통신라인
		// 에 붙어있는 응답용 빨대
		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head><meta charset=\"EUC-KR\"><head>");
		pw.print("<body>");
		pw.print("<h1>ㅎㅇ</h1>");
		pw.printf("<h2>%d</h2>", 19 + 30);
		
		Random r = new Random();
		int x = r.nextInt(10);
		pw.printf("<h2>%d</h2>", x);
		
		if (x % 2 == 1) {
			pw.print("<h1>홀수</h1>");
		} else {
			pw.print("<h2>짝수</h2>");
		}
		
		pw.print("</body></html>");
	}
	
	// 클에게 POST방식 요청 받으면
	//		특수한 방법으로만
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST방식 요청 받음");
	}
}
