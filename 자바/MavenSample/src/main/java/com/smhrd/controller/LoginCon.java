package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.domain.DAO;
import com.smhrd.domain.JDBC;
import com.smhrd.domain.Member;


public class LoginCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		
		Member m_vo = new Member(id,pw);
		
//		JDBC jdbc = new JDBC();
//		Member loginM = jdbc.login(m_vo);
		DAO dao = new DAO();
		Member loginM = dao.login(m_vo);
		
		if(loginM==null) {
			//로그인 실패
			response.sendRedirect("login.jsp");
		}else {
			//로그인 성공
			HttpSession session = request.getSession();
			session.setAttribute("loginM", loginM);
			response.sendRedirect("main.jsp");
		}
		
		
		
	}

}
