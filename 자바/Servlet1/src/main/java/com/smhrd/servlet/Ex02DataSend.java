package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02DataSend")
public class Ex02DataSend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		//getParameter() : 파라미터(form-name)를 지정하면 해당 데이터를 반환(String)
		String data = request.getParameter("data");
		
//		System.out.println(data);
		
		//응답 데이터 인코딩 방식 지정
		response.setCharacterEncoding("UTF-8");
		
		//클라이언트(브라우저)에 응답 페이지에 대한 환경설정을 알려줘야함
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("전송된 데이터 : "+data);
		out.print("</body>");
		out.print("</html>");
		
	}

}
