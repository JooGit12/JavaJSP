package com.kwon.bnsaabfp.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kwon.bnsaabfp.sns.SNSDAO;

@WebServlet("/ByeController")
public class ByeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (MemberDAO.getMdao().isLogined(request)) {
			MemberDAO.getMdao().bye(request);
			MemberDAO.getMdao().logout(request);
			MemberDAO.getMdao().isLogined(request);
		}
		SNSDAO.getSdao().clearSearchMsg(request);
		SNSDAO.getSdao().getMsg(1, request);
		request.setAttribute("subMenuPage", "blankMenu.jsp");
		request.setAttribute("contentPage", "home.jsp");
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}
}
