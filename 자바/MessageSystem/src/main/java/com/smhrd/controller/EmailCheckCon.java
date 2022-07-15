package com.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.domain.MemberDAO;


public class EmailCheckCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		
		MemberDAO dao = new MemberDAO();
		boolean check = dao.emailCheck(email); // -> 응답데이터
		//check : 사용할 수 있는 아이디 -> True
		//		  사용할 수 없는 아이디 -> false
		
		//응답데이터에 한글이 섞여져있으면 인코딩 ㄱㄱ 
		//클라이언트에게 응답(데이터를 출력)
		PrintWriter out = response.getWriter();
		//check -> boolean
		//print -> 텍스트 출력 ( boolean -> 문자열 "true"/"false")
		out.print(check);
	}

}
