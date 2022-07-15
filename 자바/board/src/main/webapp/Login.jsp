<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <table>
   <form action="LoginConM" method="post">
      <li><input type="text" name="id" placeholder="아이디를 입력하세요"></li>
      <li><input type="password" name="pw" placeholder="PW를 입력하세요"></li>
      <li><input type="submit" value="LogIn" class="button fit"></li>
      <li>아이디가 없다면 <a href="Join.jsp">회원가입</a> 클릭</li>
   </form>
   </table>

               
</body>
</html>
