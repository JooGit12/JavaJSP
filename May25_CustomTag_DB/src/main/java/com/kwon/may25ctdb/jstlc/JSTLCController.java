package com.kwon.may25ctdb.jstlc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JSTLCController")
public class JSTLCController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (!request.getParameterNames().hasMoreElements()) {
			request.setAttribute("contentPPPage", "jstlc/input.jsp");
		} else {
			Referee.judge(request);
			request.setAttribute("contentPPPage", "jstlc/output.jsp");
		}
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}
}






