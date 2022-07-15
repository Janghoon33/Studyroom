<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>테이블 만들기</h1>
	<!-- 1행 10열 테이블을 스크립트릿과 표현식을 사용하여 만들기-->
	<!-- 스크립트릿은 분리가 가능하다! -->
	
	<table border='1'>
		<tr>
		<%for(int i=1; i<=10; i++) {%>
			
			<td><%=i %></td>
			
			<% } %>
		</tr>
	</table>
	<!-- 둘다 똑같은 방법(편한거 쓰기) -->
	<table border='1'>
		<tr>
			<%
			for(int i=1; i<=10; i++){
				out.print("<td>"+i+"</td>");
			}
			%>
		</tr>
	</table>
	
	
</body>
</html>