<%@page import="com.example.MemberDTO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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

	// 세션에 저장된 dto 가져오기
	MemberDTO dto = (MemberDTO)session.getAttribute("selectDTO");

	out.print("<table border=1>");
	out.print("<tr>");
	out.print("<td>아이디 : "+ dto.getId() +"</td>");
	out.print("<td>닉네임 : "+ dto.getNick() +"</td>");
	out.print("</tr>");
	out.print("</table><br>");
	out.print("<a href='Main.jsp'>메인으로 돌아가기</a>");

%>
</body>
</html>