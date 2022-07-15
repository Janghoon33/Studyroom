package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.domain.Message;
import com.smhrd.domain.MessageDAO;


public class SendMessageCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String sendEmail = request.getParameter("sendEmail");
		String receiveEmail = request.getParameter("receiveEmail");
		String message = request.getParameter("message");
		
		Message ms_vo = new Message(sendEmail, receiveEmail, message);
		
		MessageDAO dao = new MessageDAO();
		
		int cnt = dao.insertMessage(ms_vo);
		
		if(cnt>0) {
			System.out.println("메세지 전송 성공!");
		}else {
			System.out.println("메세지 전송 실패");
		}
		
		response.sendRedirect("main.jsp");
		
		
	}

}
