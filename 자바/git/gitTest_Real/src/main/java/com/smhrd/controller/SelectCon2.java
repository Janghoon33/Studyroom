package com.smhrd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.domain.SelectExDAO;
import com.smhrd.domain.SelectExmember;


public class SelectCon2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("[SelectCon2]");
		request.setCharacterEncoding("UTF-8");
		
		String ex_name = request.getParameter("ex_name");
		String ex_team = request.getParameter("ex_team");
		String Title = request.getParameter("Title");
		String ex_id = request.getParameter("ex_id");
		
		
		SelectExmember se = new SelectExmember(ex_name,ex_team,Title,ex_id);
		
		SelectExDAO dao = new SelectExDAO();
		List<SelectExmember> cnt = dao.selectEx();

		
		if(cnt!=null) {
			System.out.println("불러오기 성공!");
		}else {
			System.out.println("불러오기 실패");
		}
		
		response.sendRedirect("expertpage.jsp");
	}

}
