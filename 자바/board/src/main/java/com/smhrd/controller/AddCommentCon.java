package com.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.domain.BoardDAO;
import com.smhrd.domain.Comm;


public class AddCommentCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String boardNum = request.getParameter("boardNum");
		//String -> BigDecimal
		BigDecimal boardNumDecimal = new BigDecimal(boardNum);
		String com = request.getParameter("com");
		
		Comm comm = new Comm(boardNumDecimal, com);
		
		BoardDAO dao = new BoardDAO();
		//commNum : 현재 작성한 댓글의 테이블 상 시퀀스 번호(댓글들을 식별할 수 있는 값)
		int commNum = dao.addComment(comm);
		
		PrintWriter out = response.getWriter();
		out.print(commNum);
	}

}
