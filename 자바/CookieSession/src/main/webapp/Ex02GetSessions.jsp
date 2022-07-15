<%@page import="java.util.Enumeration"%>
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
		// Enumeration : 객체들의 집합 - 각 객체들을 하나씩 처리할 수 있는 메소드를 제공
		Enumeration names = session.getAttributeNames();
		
		// hasMoreElements() : names 안에 요소가 더 있으면 true, 없으면 false 반환
		while(names.hasMoreElements()){
			// session객체의 키값(name) 가져오기
			String name = names.nextElement().toString();
			// 키값을 통해 실제 값 가져오기
			String value = session.getAttribute(name).toString();
			out.print(name+" : "+value+"<br>");
		}
	%>
</body>
</html>