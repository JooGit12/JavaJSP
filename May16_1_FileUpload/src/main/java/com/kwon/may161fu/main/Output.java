package com.kwon.may161fu.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/Output")
public class Output extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request.setCharacterEncoding("euc-kr");
		response.setCharacterEncoding("euc-kr");

		// 파일이 업로드될 폴더 절대경로
		// 상대경로 -> 서버상의 절대경로
		String path = request.getSession().getServletContext().getRealPath("imageeee");
		System.out.println(path);
		
		// cos.jar의 방식으로 인코딩되어서 날아온 요청객체 + 파일업로드까지
		MultipartRequest mr 
			= new MultipartRequest(
				request, path,
				10 * 1024 * 1024,			  // 허용해줄 파일 최대 크기(넘어가면 Exception)
				"euc-kr",					  // 요청파라메터 한글처리
				new DefaultFileRenamePolicy() // 업로드한 파일명 중복되면 그냥 숫자 붙여서
			);
		
		// request.getParameter(...) : Tomcat방식으로 인코딩되어서 값 올때
		// String tttitleee = request.getParameter("tttitleee");
		String tttitleee = mr.getParameter("tttitleee");
		
		// 중복처리 당해있을 파일명
		String p = mr.getFilesystemName("photooooo"); // ㅋ ㅋ10.png
		// Tomcat이 한글로 된 파일명 인식 불가
		p = URLEncoder.encode(p, "euc-kr"); 		  // %2A+%2A10.png
		// Tomcat이 띄어쓰기는 띄어쓰기 그대로 둬야
		p = p.replace("+", " ");					  // %2A %2A10.png
		
		// 사용자는 ㅋ ㅋ.png를 업로드 : 파일명이 2자
		// 최종적으로 %2A %2A10.png : 13자
		String z = URLEncoder.encode(mr.getFilesystemName("zzzip"), "euc-kr").replace("+", " ");
		
		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head><meta charset=\"EUC-KR\">");
		pw.print("</head>");
		pw.print("<body>");
		pw.printf("제목 : %s<br>", tttitleee);
		pw.printf("파일명 : %s<br>", p);
		pw.printf("<img src=\"imageeee/%s\"><br>", p);
		pw.printf("<a href=\"imageeee/%s\">다운</a>", z);
		pw.print("</body></html>");
	}

}
