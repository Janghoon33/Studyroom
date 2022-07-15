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
		// 쿠키 삭제 (삭제 메소드는 따로 존재하지 않음)
		// 1. 쿠키 생성 -> 삭제할 쿠키의 키(name)과 동일한 키를 가진 쿠키를 생성
		Cookie cookie = new Cookie("id","");
		
		// 2. 유효기간을 설정 (0)
		cookie.setMaxAge(0);
		
		// 3. 쿠키를 클라이언트로 전송
		response.addCookie(cookie);
	%>
	<a href="Ex01GetCookie.jsp">쿠키확인</a>
</body>
</html>