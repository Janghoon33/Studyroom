package com.smhrd.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex03UserInfo")
public class Ex03UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String job = request.getParameter("job");
		String gender = request.getParameter("gender");
//		String hobby = request.getParameter("hobby");
		String[] hobbies = request.getParameterValues("hobby");
		
		System.out.println("직업 : "+job);
		System.out.println("성별 : "+gender);
		System.out.println("취미 : "+hobbies);
		for(String h : hobbies) { // 확장 for문(for~each문) - 배열,어레이리스트 다룰때 유용
			System.out.println(h);
		}
	}

}
