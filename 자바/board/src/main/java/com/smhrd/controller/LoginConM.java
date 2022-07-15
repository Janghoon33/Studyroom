package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.domain.BMemberDAO;
import com.smhrd.domain.Member;


@WebServlet("/LoginConM")
public class LoginConM extends HttpServlet {
   private static final long serialVersionUID = 1L;


   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("[LoginCon]");
      //post 방식으로 데이터 전송 시 인코딩
      request.setCharacterEncoding("UTF-8");
      
            
      String id = request.getParameter("id");
      String pw = request.getParameter("pw");
      String nick = request.getParameter("nick");
      
      Member m_vo = new Member(id, pw);
      
      BMemberDAO dao = new BMemberDAO();
      Member loginMember = dao.selectMember(m_vo);
      
      if(loginMember !=null) {
         //로그인 성공
         System.out.println("로그인 성공");
         HttpSession session = request.getSession();
         session.setAttribute("loginMember", nick);
         response.sendRedirect("Main.jsp");
         
      }else {
         //로그인 실패
         System.out.println("로그인 실패");
         response.sendRedirect("Login.jsp");
         
      }
      
   }

}