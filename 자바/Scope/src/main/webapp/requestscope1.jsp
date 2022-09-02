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
		// request영역에 값 설정
		request.setAttribute("nick", "병갑짱");
		
		//request영역 값 가지고 오기
		String nick = (String)request.getAttribute("nick");
		
		//forwarding 방식 사용
		RequestDispatcher rd = request.getRequestDispatcher("requestscope2.jsp");
		rd.forward(request,response);
	%>
	
	<%=nick %>
	${nick}
	
	<a href="requestscope2.jsp">2로 이동</a>
</body>
</html>