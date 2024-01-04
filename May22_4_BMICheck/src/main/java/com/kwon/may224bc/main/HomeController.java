package com.kwon.may224bc.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	// 첫 : get
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("input.html").forward(request, response);
	}

	// 결과보기 : 어차피 나중에 파일업로드 -> post
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Doctor.calculate(request);
		request.getRequestDispatcher("output.jsp").forward(request, response);
	}

}
