package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.domain.MemberDAO;


public class DeleteCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String email = request.getParameter("email");
		
		MemberDAO dao = new MemberDAO();
		int cnt = dao.deleteMember(email);
		
		
		if(cnt > 0) {
			System.out.println("회원삭제 성공");
		}else {
			System.out.println("회원삭제 실패");
		}
		
		//--------------------------------
		response.sendRedirect("select.jsp");
		
	}

}
