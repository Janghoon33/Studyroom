package com.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.domain.BoardDAO;



public class LikeAjaxCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String status = request.getParameter("status");
		int boardNum = Integer.parseInt(request.getParameter("boardNum"));
		
		BoardDAO dao = new BoardDAO();
		dao.updateLike(status, boardNum);
		
		//수정된 좋아요 개수 다시 불러오기!
		int like = dao.getLike(boardNum);
		
		PrintWriter out = response.getWriter();
		out.print(like);
	}

}
