<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 회원정보를 입력 후에 로그인 버튼을 누르면 loginCheck.jsp로 이동 -->
<form action="loginCheck.jsp" method="post">
	아이디 <input type="text" name="id"><br>
	비밀번호 <input type="password" name="pw"><br>
	<input type="submit" value="로그인">

</form>
</body>
</html>