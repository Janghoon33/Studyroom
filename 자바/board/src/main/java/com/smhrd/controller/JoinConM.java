package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.domain.Member;
import com.smhrd.domain.BMemberDAO;


public class JoinConM extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("[JoinConM]");
		
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		
		Member m_vo = new Member(id,pw,nick,email,tel);
		
		BMemberDAO dao = new BMemberDAO();
		int cnt = dao.insertMember(m_vo);
		
		if(cnt>0) {
			System.out.println("회원가입 성공");
			
			RequestDispatcher rd = request.getRequestDispatcher("Main.jsp");
			request.setAttribute("joinId", id);
			rd.forward(request, response);
		}else {
			System.out.println("회원가입 실패");
			response.sendRedirect("Join.jsp");
		}
	}

}
