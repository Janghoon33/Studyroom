<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
				<c:choose>					
					<c:when test="${empty loginMember}">
						<a href="#menu">로그인</a>
					</c:when>					
					<c:otherwise>
						
						<!-- 단순 if문 -->
						<c:if test="${loginMember.email eq 'admin'}">							
						</c:if>
						<a href="LogoutCon">로그아웃</a>
						<a href="update.jsp">개인정보수정</a>
					</c:otherwise>
				</c:choose>	
</body>
</html>