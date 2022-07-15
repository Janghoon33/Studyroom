
package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.smhrd.domain.ExMember;
import com.smhrd.domain.exFile;
import com.smhrd.domain.exFileDAO;


public class ExFileCon extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		
		String path = request.getServletContext().getRealPath("uploadFile");  
		System.out.println(path);
		
		int maxsize = 100*1024*1024;
		String encoding = "UTF-8";
		
		
		
		MultipartRequest multi = new MultipartRequest(request, path, maxsize, encoding, new DefaultFileRenamePolicy());
		
		String ex_id = multi.getParameter("joinEmail");
		String filename = multi.getFilesystemName("uploadFile");
		
		
		
		exFile exf_vo = new exFile(ex_id, filename);
		//exFile객체에 담기
		exFileDAO exfdao = new exFileDAO();		
		int cnt = exfdao.insertFile(exf_vo);
		
		//DAO 객체 생성
		
		if(cnt>0) { //회원가입 성공
			System.out.println("데이터 입력 성공");
			//회원가입한 회원의 정보중에서 email 넘겨 페이지 이동
			//fowarding 방식으로 정보 담기	
			//response.sendRedirect("joinSuccess.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("TestMain.jsp");
			request.setAttribute("joinEmail", ex_id);
			rd.forward(request, response);
			
		}else {	//회원가입 실패
			System.out.println("회원가입 실패");
			response.sendRedirect("TestMain.jsp");
	
		//cnt = dao.______(exFile)
		
		///------저장
		
		
		
		
		
		
		
		
		
//		ExMember exfile_vo = new ExMember(ex_id, filename, filerealname);
//		
//		
//		exFileDAO exfiledao = new exFileDAO();
//		
//		int cnt = exfiledao.insertFile(exfile_vo);
//	
	
//	if(cnt>0) { //회원가입 성공
//		System.out.println("데이터 입력 성공");
//		//회원가입한 회원의 정보중에서 email 넘겨 페이지 이동 
//		//fowarding 방식으로 정보 담기	
//		//response.sendRedirect("joinSuccess.jsp"); 
//		RequestDispatcher rd = request.getRequestDispatcher("joinsuccess.jsp");
//		request.setAttribute("filename", filename);
//		rd.forward(request, response);
//		
//		
//		
//	}else {	//회원가입 실패
//		System.out.println("회원가입 실패");
//		response.sendRedirect("Main.jsp");		
//		}
		}
	}
}
