package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.domain.WriteDAO;
import com.smhrd.domain.Write;



public class WriteTitleCon2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("UTF-8");
		
		String Title = request.getParameter("Title");
		String ex_id = request.getParameter("ex_id");
		String Price1 = request.getParameter("Price1");
		String Pricetext1 = request.getParameter("Pricetext1");
		String Caretext1 = request.getParameter("Caretext1");
		
		Write wrt = new Write(ex_id,Title,Price1,Pricetext1,Caretext1);
		
		WriteDAO dao = new WriteDAO();	
		int cnt = dao.insertTitle(wrt);
		
		if(cnt>0) {
			System.out.println("제목 전송 성공!");
		}else {
			System.out.println("제목 전송 실패!");
		}
		
		response.sendRedirect("expertpage.jsp");
	}

}
