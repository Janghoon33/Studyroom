<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% String joinEmail = (String)request.getAttribute("joinEmail"); %>
 	<form method="post" enctype="multipart/form-data" action="ExFileCon">
    file<br/> 
    <input type="file" name="uploadFile"><br/><br/>
    <input type="hidden" name="joinEmail" value="<%= joinEmail%>">
    <input type="submit" value="UPLOAD"><br/>
    
</form>
</body>
</html>
