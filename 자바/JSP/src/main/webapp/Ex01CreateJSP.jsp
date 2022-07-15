<!-- 주석1)HTML주석 
	주석이 브라우저에서 노출됨-->

<!-- 1)지시자 : 페이지 전체 설정 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%!
	// 주석2) 자바주석 -> 한줄씩 작성, 노출안됨
	// 2) 선언문 : 상수나 메소드를 정의할 수 있는 공간 (변수 선언 -> 전역 변수)
	int num1 = 0;
	public void show(){
		System.out.print("Hello JSP!!");
	}
	%>
	<h1>JSP페이지 만들기</h1>
	
	<%
	/* 주석3)자바주석 
		여러줄을 작성, 노출안됨 */
	
	// 3) 스크립트릿 : 자바문법을 사용할수 있는 공간 (변수 선언 -> 지역 변수)
	int num2 = 0;
	show();
	
	%>
	<%-- 주석4)JSP주석(스크립트릿 영역밖에서) 노출안됨 --%>
	<!-- 4)표현식 : 웹페이지에 결과값을 출력 -->
	<%=num1++ %>
	<%=num2++ %>
	
</body>
</html>