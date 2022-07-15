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
		// 세션 : 서버가 정보를 가지고 있음(쿠키보다 보안이 더 좋음)
		// 1. 세션 값 설정
		// setAttribute(String, Object-업캐스팅)
		// = setAttribute("세션 이름","세션 값")
		session.setAttribute("id","test");
		session.setAttribute("age",20);
		
	%>
	<a href="Ex02GetSession.jsp">세션확인</a>
	<a href="Ex02GetSession.jsp">세션모두확인</a>
</body>
</html>