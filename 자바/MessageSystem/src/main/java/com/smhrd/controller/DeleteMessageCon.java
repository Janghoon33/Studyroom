package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.domain.MessageDAO;


public class DeleteMessageCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int msgNum = Integer.parseInt(request.getParameter("msgNum"));
		
		MessageDAO dao = new MessageDAO();
		int cnt = dao.deleteOneMessage(msgNum);
		if(cnt>0) {
			System.out.println("전체 메세지삭제 성공");
		}else {
			System.out.println("전체 메세지삭제 실패");
		}
		response.sendRedirect("main.jsp");
	}

}
