<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<ul class="actions vertical">
				<li><h5>회원가입</h5></li>
				<form action="JoinCon" method="post">
					<li><input type="text" name="mem_id" id="mem_id" placeholder="아이디를 입력하세요" ></li>
					<li><input type="button" value="id중복체크" onclick="emailCheck()"></li>
					<li><span id="check"></span></li>
					<li><input type="password" name="mem_pw" placeholder="PW를 입력하세요" ></li>
					<li><input type="text" name="mem_nick" placeholder="닉네임를 입력하세요" ></li>
					<li><input type="text" name="mem_email" placeholder="집주소를 입력하세요" ></li>
					<li><input type="submit" value="JoinUs" class="button fit"></li>
				</form>
			</ul>


</body>
</html>