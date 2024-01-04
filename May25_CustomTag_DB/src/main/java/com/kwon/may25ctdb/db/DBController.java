package com.kwon.may25ctdb.db;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DBController")
public class DBController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DBDAO.connectTest(request);
		request.setAttribute("contentPPPage", "db.jsp");
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}

}
