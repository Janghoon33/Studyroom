package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogoutCon")
public class LogoutCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 세션 객체 생성
		HttpSession session = request.getSession();
		// 세션에 저장된 id 삭제하기
		
		// session.removeAttribute("id");
		session.removeAttribute("dto");
		response.sendRedirect("Main.jsp");

		
		
		
		
	}

}
