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


@WebServlet("/UpdateCon")
public class UpdateCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 0. 인코딩
		request.setCharacterEncoding("UTF-8");

		// 1. id , select, data 가져오기
		String id = request.getParameter("id");
		String select = request.getParameter("select");
		String data = request.getParameter("data");
			
		MemberDAO dao = new MemberDAO();
		int cnt = dao.update(id, select, data);
		
		if(cnt > 0){
			// sql문 실행이 성공하면 => 회원정보수정이 성공하면
			// 메인으로 이동하기
			response.sendRedirect("Main.jsp");
			
			
			//out.print(id+"님 회원정보 수정했습니다.");
			//out.print("<a href='Main.jsp'>메인으로 가기</a>");
		}else{
			// sql문 실행이 실패하면
			System.out.print("회원정보 수정 실패!");
			response.sendRedirect("update.html");
			//out.print("<a href='update.html'>회원정보수정 돌아가기</a>");
		}
	}

}
