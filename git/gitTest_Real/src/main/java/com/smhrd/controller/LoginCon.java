package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.domain.Member;
import com.smhrd.domain.MemberDAO;


@WebServlet("/LoginCon")
public class LoginCon extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[LoginCon]");
		//post 방식으로 데이터 전송 시 인코딩
		request.setCharacterEncoding("UTF-8");
		
		//이메일, 비밀번호를 받아와서

		String mem_id = request.getParameter("mem_id");
		String mem_pw = request.getParameter("mem_pw");
		
				//Member 객체에 담기
		Member m_vo = new Member(mem_id, mem_pw);
		
		MemberDAO dao = new MemberDAO();
		Member loginMember = dao.selectMember(m_vo);
		
		if(loginMember !=null) {
			//로그인 성공
			System.out.println("로그인 성공");
			HttpSession session = request.getSession();
			session.setAttribute("loginMember", loginMember);
			response.sendRedirect("loginafter.jsp");
			
		}else {
			//로그인 실패
			System.out.println("로그인 실패");
			response.sendRedirect("Main.jsp");
			
		}
	}

}
