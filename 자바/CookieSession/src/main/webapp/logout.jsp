<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 세션에 저장된 닉네임을 삭제, loginForm.jsp로 이동 -->
<%
	session.removeAttribute("nick");
	response.sendRedirect("loginForm.jsp");
%>
</body>
</html>