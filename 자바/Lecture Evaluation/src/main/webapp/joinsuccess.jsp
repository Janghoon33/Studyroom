<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="user.UserDTO" %>
    <%@ page import="user.UserDAO" %>
    <%@ page import="util.SHA256" %>
    <%@page import="java.io.PrintWriter"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>강의평가 웹 사이트</title>
	<!-- 부트스트랩 CSS 추가하기 -->
	<link rel="stylesheet" href="./css/bootstrap.min.css">
	<!-- 커스텀 CSS 추가하기 -->
	<link rel="stylesheet" href="./css/custom.css">
	
</head>
<body>
    <%
    	request.setCharacterEncoding("UTF-8");
    	String userID = null;
    	if(session.getAttribute("userID")!=null){
    		userID = (String) session.getAttribute("userID");
    	}
    	if(userID == null){
    		PrintWriter script = response.getWriter();
    		script.println("<script>");
    		script.println("alert('로그인을 해주세요.')");
    		script.println("location.href= 'userLogin.jsp';");
    		script.println("</script>");
    		script.close();
    		return;
    	}
    	
    	String userPassword = null;
    	String userEmail = null;
    	if(request.getParameter("userID")!=null){
    		userID = request.getParameter("userID");
    	}
    	if(request.getParameter("userPassword")!=null){
    		userPassword = request.getParameter("userPassword");
    	}
    	if(request.getParameter("userEmail")!=null){
    		userEmail = request.getParameter("userEmail");
    	}
    	
    	UserDAO userDAO = new UserDAO();
    	int result = userDAO.join(new UserDTO(userID, userPassword, userEmail,SHA256.getSHA256(userEmail),false));
    	if (result == -1){
    		PrintWriter script = response.getWriter();
    		script.println("<script>");
    		script.println("alert('이미 존재하는 아이디입니다.');");
    		script.println("history.back();");
    		script.println("</script>");
    		script.close();
    		return;
    	}else{
    		session.setAttribute("userID", userID);
    		PrintWriter script = response.getWriter();
    		script.println("<script>");
    		script.println("location.href = 'index.jsp'");
    		script.println("</script>");
    		script.close();
    		return;
    	}
    	%>
    	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="index.jsp">강의평가 웹 사이트</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active">
					<a class="nav-link" href="index.jsp">메인</a>
				</li>
				<li class="nav-item dropdown"> <!-- 부트스트랩 4.0 쓸것! 5.0쓰면 dropdown 안됨 -->
					<a class="nav-link pl-0 dropdown-toggle" id="dropdown" data-toggle="dropdown">
						회원 관리
					</a>
					<div class="dropdown-menu" aria-labelledby="dropdown">
<%
	if(userID == null) {
%>
						<a class="dropdown-item" href="userLogin.jsp">로그인</a>
						<a class="dropdown-item" href="userJoin.jsp">회원가입</a>
<%
	} else {
%>				
						<a class="dropdown-item" href="userLogout.jsp">로그아웃</a>
<%
	}
%>											
					</div>
				</li>
			</ul>
			<form action="./index.jsp" method="get" class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="text" name="search" placeholder="내용을 입력하세요." aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">검색</button>
			</form>
		</div>
	</nav>
	<section class="container mt-5"  style="max-width: 560px;">
		<div class="alert  alert-success mt-4" role = "alert">
			회원가입이 완료되었습니다
		</div>
		<a href="index.jsp" class="btn btn-primary">홈으로 돌아가기</a>
	</section>
	
	
	<footer class="bg-dark mt-4 p-5 text-content" style="color: #FFFFFF;">
		Copyright &copy; 2022 전장훈 All Rights Reserved.
	</footer>
	
	<!-- 제이쿼리 자바스크립트 추가하기 -->
	<script src="./js/jquery.min.js"></script>
	<!-- 파퍼 자바스크립트 추가하기 -->
	<script src="./js/pooper.js"></script>
	<!-- 부트스트랩 자바스크립트 추가하기 -->
	<script src="./js/bootstrap.min.js"></script>	
	
</body>
</html>