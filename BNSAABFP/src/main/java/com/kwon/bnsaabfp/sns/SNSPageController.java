package com.kwon.bnsaabfp.sns;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kwon.bnsaabfp.member.MemberDAO;

import kiung.kwon.token.generator.KwonTokenGenerator;

@WebServlet("/SNSPageController")
public class SNSPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (MemberDAO.getMdao().isLogined(request)) {
			request.setAttribute("subMenuPage", "sns/snsMenu.jsp");
		} else {
			request.setAttribute("subMenuPage", "blankMenu.jsp");
		}
		int p = Integer.parseInt(request.getParameter("p"));
		KwonTokenGenerator.generate(request);
		SNSDAO.getSdao().getMsg(p, request);
		request.setAttribute("contentPage", "home.jsp");
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}

}
