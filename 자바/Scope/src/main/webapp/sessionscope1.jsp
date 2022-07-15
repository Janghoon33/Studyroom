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
		//세션 영역안에 값 저장
		//setAttribute(키/네임(String), 실제값/value(Object))
		session.setAttribute("nick", "쿠키몬스터");
		String nick = (String)session.getAttribute("nick");
	%>
	<%=nick %>
	${sessionScope.nick}	
	
	<a href="sessionscope2.jsp">2로 이동</a>
</body>
</html>