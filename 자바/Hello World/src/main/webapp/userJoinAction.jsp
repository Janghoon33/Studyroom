<%@page import="user.UserDAO"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String userID = null;
		String userPassword = null;
		if(request.getParameter("userID") != null ){
			userID = (String) request.getParameter("userID");
		}
		if(request.getParameter("userPassword") != null){
			userPassword = (String) request.getParameter("userPassword");
		}
		if(userID == null || userPassword == null){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('입력이 안된 사항이 있습니다.');");
			script.println("location.href = 'index.jsp';");
			script.println("</script>");
			script.close();
			return;
		}
		UserDAO userDAO = new UserDAO();
		int result = userDAO.join(userID,userPassword);
	%>
</body>
</html>