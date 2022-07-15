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
		// 쿠키 : 클라이언트가 정보를 가지고 있는 임시파일
		// 1. 쿠키 객체 생성
		// Cookie(키(String),실제값(String))
		Cookie cookie = new Cookie("test","firstcookie");
		
		// 2. 유효기간 설정 (초단위)
		cookie.setMaxAge(60*60*24*365); // 1년
		
		// 3. 클라이언트에 쿠키 전송
		response.addCookie(cookie);
		
		// 4. 쿠키를 생성하여 바로 클라이언트에 전송(유효기간 x)
		response.addCookie(new Cookie("id","smhrd"));
	%>
	
	<a href="Ex01GetCookie.jsp">쿠키확인</a>
</body>
</html>