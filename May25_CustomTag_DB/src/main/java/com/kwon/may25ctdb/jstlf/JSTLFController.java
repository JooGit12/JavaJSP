package com.kwon.may25ctdb.jstlf;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JSTLFController")
public class JSTLFController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataMaker.make(request);
		request.setAttribute("contentPPPage", "jstlf.jsp");
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}

}
