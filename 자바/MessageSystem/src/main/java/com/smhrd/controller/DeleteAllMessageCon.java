package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.domain.Member;
import com.smhrd.domain.MessageDAO;


public class DeleteAllMessageCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		Member loginMember = (Member)session.getAttribute("loginMember");
		
		MessageDAO dao = new MessageDAO();
		int cnt = dao.deleteAllMessage(loginMember.getEmail());
		
		if(cnt>0) {
			System.out.println("전체메세지삭제 성공");
		}else {
			System.out.println("전체메세지삭제 실패");
		}
		
		response.sendRedirect("main.jsp");
	}
	

}
