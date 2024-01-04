package com.kwon.bnsaabfp.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kwon.bnsaabfp.home.DateManager;
import com.kwon.bnsaabfp.sns.SNSDAO;

@WebServlet("/JoinController")
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DateManager.getCurYear(request);
		MemberDAO.getMdao().isLogined(request);
		request.setAttribute("subMenuPage", "blankMenu.jsp");
		request.setAttribute("contentPage", "member/join.jsp");
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberDAO.getMdao().join(request);
		MemberDAO.getMdao().isLogined(request);
		SNSDAO.getSdao().clearSearchMsg(request);
		SNSDAO.getSdao().getMsg(1, request);
		request.setAttribute("subMenuPage", "blankMenu.jsp");
		request.setAttribute("contentPage", "home.jsp");
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}

}
