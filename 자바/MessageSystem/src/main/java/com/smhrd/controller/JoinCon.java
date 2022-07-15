package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.domain.Member;
import com.smhrd.domain.MemberDAO;


public class JoinCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("[JoinCon]");
		//post 방식 요청 데이터 인코딩
		request.setCharacterEncoding("UTF-8");
		
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		
		Member m_vo = new Member(email,pw,tel,address);
		
		MemberDAO dao = new MemberDAO();
		int cnt = dao.insertMember(m_vo);
		
		if(cnt>0) { // 회원가입 성공
			System.out.println("회원가입 성공");
			// 회원가입한 회원의 정보 중에서 email 넘겨 페이지 이동
			// fowarding방식으로 정보 담기
//			response.sendRedirect("joinSuccess.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("joinSuccess.jsp");
			request.setAttribute("joinEmail", email);
			rd.forward(request, response);
			
			
		}else { // 회원가입 실패
			System.out.println("회원가입 실패");
			response.sendRedirect("main.jsp");
		}
	}

}
