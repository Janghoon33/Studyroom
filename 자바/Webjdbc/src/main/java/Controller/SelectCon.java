package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.MemberDTO;

import model.MemberDAO;


@WebServlet("/SelectCon")
public class SelectCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 인코딩
		request.setCharacterEncoding("UTF-8");
		
		// 아이디 값 가져오기
		String id = request.getParameter("id");
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.select(id);
		
		if(dto!=null) {
		// DTO객체를 세션에 저장
		// 세션 객체 생성
		HttpSession session = request.getSession();
		session.setAttribute("selectDTO", dto);
		
		//selectCheck.jsp로 이동
		response.sendRedirect("selectCheck.jsp");
		}else {
			response.sendRedirect("select.html");
		}
		
	}

}
