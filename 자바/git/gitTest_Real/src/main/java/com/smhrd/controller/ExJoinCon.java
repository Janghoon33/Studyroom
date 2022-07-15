package com.smhrd.controller;

import java.io.IOException;
import java.security.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.domain.ExMember;
import com.smhrd.domain.ExMemberDAO;



public class ExJoinCon extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
				
				
		String ex_id = request.getParameter("ex_id");
		String ex_pw = request.getParameter("ex_pw");
		String ex_name = request.getParameter("ex_name");
		String ex_team = request.getParameter("ex_team");	
		String ex_phone = request.getParameter("ex_phone");
		
		
		ExMember exm_vo = new ExMember(ex_id, ex_pw, ex_name, ex_team, ex_phone);
		
		ExMemberDAO exdao = new ExMemberDAO();		
		int cnt = exdao.ExInsertMember(exm_vo);
		
		if(cnt>0) { //회원가입 성공
			System.out.println("회원가입 성공");
			//회원가입한 회원의 정보중에서 email 넘겨 페이지 이동
			//fowarding 방식으로 정보 담기	
			//response.sendRedirect("joinSuccess.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("ExJoinAfter.jsp");
			request.setAttribute("joinEmail", ex_id);
			rd.forward(request, response);
			
		}else {	//회원가입 실패
			System.out.println("회원가입 실패");
			response.sendRedirect("testform.jsp");
			
		}

	}

}
