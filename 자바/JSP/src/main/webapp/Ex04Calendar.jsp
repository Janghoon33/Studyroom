<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>현재시간 출력하기</h1>
	<%
		GregorianCalendar cal = new GregorianCalendar();
	%>
	
	<%= cal.get(Calendar.YEAR) %>년
	<%= cal.get(Calendar.MONTH)+1 %>월 <!-- 0부터 시작해서 +1해야함 -->
	<%= cal.get(Calendar.DATE) %>일
	
	<%= cal.get(Calendar.HOUR) %>시
	<%= cal.get(Calendar.MINUTE) %>분
	<%= cal.get(Calendar.SECOND) %>초
	
</body>
</html>