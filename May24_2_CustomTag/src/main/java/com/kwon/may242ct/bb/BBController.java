package com.kwon.may242ct.bb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BBController")
public class BBController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BBGameEngine.getBbge().pickAns();
		request.setAttribute("contentPageHaha", "bb.jsp");
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BBGameEngine.getBbge().judge(request);
		request.setAttribute("contentPageHaha", "bb.jsp");
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}

}



