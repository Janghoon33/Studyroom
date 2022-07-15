package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;


@WebServlet("/JoinCon")
public class JoinCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 인코딩
		request.setCharacterEncoding("UTF-8");
		
		// 아이디,비밀번호,닉네임 값 가져오기(파라미터 수집)
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		
		// DAO 사용하기
		MemberDAO dao = new MemberDAO();
		int cnt = dao.join(id, pw, nick);
		
		if(cnt > 0){
			// sql문 실행이 성공하면 메인으로 이동하기
			response.sendRedirect("Main.jsp");
			
			//out.print(id+"님 회원가입 성공했습니다.");
			//out.print("<a href='Main.jsp'>메인으로 가기</a>");
		}else{
			// sql문 실행이 실패하면
			System.out.print("회원가입 실패!");
			response.sendRedirect("join.html");
//			out.print("<a href='join.html'>회원가입 돌아가기</a>");
		}
		
	}//service

}//class
