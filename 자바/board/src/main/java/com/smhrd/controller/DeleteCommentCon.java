package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.domain.BoardDAO;



public class DeleteCommentCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int commentNum = Integer.parseInt(request.getParameter("commentNum"));
		
		BoardDAO dao = new BoardDAO();
		//삭제
		dao.deleteComment(commentNum);
		
		//응답데이터x
	}

}
