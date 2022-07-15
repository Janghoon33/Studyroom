package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/A02Join")
public class A02Join extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//post방식으로 전송 -> 인코딩
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String re_pw = request.getParameter("re_pw");
		String gender = request.getParameter("gender");
		String blood = request.getParameter("blood");
		String birth = request.getParameter("birth");
		String[] hobbies = request.getParameterValues("hobby");
		String color = request.getParameter("color");
		String textarea = request.getParameter("textarea");
		
		String newtext = textarea.replace("\n","<br>");
		
		//돌려주기 위해서 돌려줄 페이지 설정
		response.setContentType("text/html; charset=UTF-8");
		
		//출력스트림, 값을 출력하기 위한 통로
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("ID :"+id+"<br>");
		out.print("PW :"+pw+"<br>");
		if(pw.equals(re_pw)) {
			out.print("비밀번호가 일치합니다."+"<br>");
		}else {
			out.print("비밀번호가 일치하지 않습니다."+"<br>");
		}
		
		out.print("GENDER : "+gender+"<br>");
		out.print("BLOOD : "+blood+"<br>");
		out.print("BIRTH : "+birth+"<br>");
		out.print("HOBBY : ");
		for(String h : hobbies) {
			out.print(h + " ");
		}
		out.print("<br>");
		out.print("COLOR : "+color+"<br>");
		out.print("TEXT : "+newtext+"<br>");
		out.print("</body>");
		out.print("</html>");
		
		
		
		
	}

}
