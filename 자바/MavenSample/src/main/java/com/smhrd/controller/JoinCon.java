package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.domain.DAO;
import com.smhrd.domain.JDBC;
import com.smhrd.domain.Member;


public class JoinCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//post 방식 요청 데이터 인코딩
		request.setCharacterEncoding("UTF-8");
		
		// 요청 시 보내온 파라미터 값 받기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		
		Member m_vo= new Member(id,pw,nick);
		
//		JDBC jdbc = new JDBC();
//		int cnt = jdbc.join(m_vo);
		DAO dao = new DAO();
		int cnt = dao.join(m_vo);
		
		if(cnt>0) {
			response.sendRedirect("main.jsp");
		}else {
			response.sendRedirect("join.jsp");
		}
		
	}

}
