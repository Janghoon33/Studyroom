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
		//page 영역에 값 설정
		pageContext.setAttribute("nick", "고병갑");
	
		//page 영역에 값 가지고 오기
		String nick = (String)pageContext.getAttribute("nick");
		
		//forwarding 방식 사용 시도!
		RequestDispatcher rd = request.getRequestDispatcher("pagescope2.jsp");
		rd.forward(request,response);
	%>
		
	<!-- el표기법 -->
	${pageScope.nick }
	<%=nick %>
	<a href="pagescope2.jsp">2로 이동</a>
</body>
</html>