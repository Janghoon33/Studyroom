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
		// 세션삭제
		session.removeAttribute("id");
	
	%>
	
	<a href="Ex02GetSession.jsp">세션확인</a>
</body>
</html>