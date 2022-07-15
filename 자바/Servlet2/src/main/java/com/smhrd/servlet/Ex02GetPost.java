package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02GetPost")
public class Ex02GetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// GET 방식으로 요청시에 한글 데이터 인코딩 방법
		// URL 한글 인코딩 추가
		
		
		// 요청 데이터 인코딩 방식 지정(위치 중요 - 파라미터 값 얻기전에 작성)
		// Post 방식으로 요청시 한글데이터 인코딩 방법
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print(name);
		out.print("</body>");
		out.print("</html>");
	}

}
