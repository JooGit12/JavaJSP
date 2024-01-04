package com.kwon.bnsaabfp.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kwon.bnsaabfp.home.DateManager;
import com.kwon.bnsaabfp.sns.SNSDAO;

@WebServlet("/MemberInfoController")
public class MemberInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (MemberDAO.getMdao().isLogined(request)) {
			DateManager.getCurYear(request);
			MemberDAO.getMdao().getInfo(request);
			request.setAttribute("contentPage", "member/info.jsp");
		} else {
			SNSDAO.getSdao().clearSearchMsg(request);
			SNSDAO.getSdao().getMsg(1, request);
			request.setAttribute("contentPage", "home.jsp");
		}
		request.setAttribute("subMenuPage", "blankMenu.jsp");
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (MemberDAO.getMdao().isLogined(request)) {
			MemberDAO.getMdao().update(request);
			DateManager.getCurYear(request);
			MemberDAO.getMdao().getInfo(request);
			request.setAttribute("contentPage", "member/info.jsp");
		} else {
			SNSDAO.getSdao().clearSearchMsg(request);
			SNSDAO.getSdao().getMsg(1, request);
			request.setAttribute("contentPage", "home.jsp");
		}
		request.setAttribute("subMenuPage", "blankMenu.jsp");
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}

}
