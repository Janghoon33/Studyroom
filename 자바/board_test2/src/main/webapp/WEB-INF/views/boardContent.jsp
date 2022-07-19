<%@page import="com.board.test.domain.Board"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 내용</title>
<style>
	*{
		margin : 0 auto;
		padding : 0 auto;
		overflow : hidden;
	}	
	td, h2 {
		text-align : center;
	}
</style>
</head>
<script type="text/javascript">
  	function goList(){
  		location.href='/boardList'
  	}
  	
  </script>
  
<body>
	
	  <h2>글 내용</h2>
	  
	  
	  	<table width="500" cellpadding="0" cellspacing="0" border="1">
	  		<tr>
	  			<td>번호</td>
	  			<td>${board.b_num }</td>
	  		</tr>
	  		
	  		<tr>
	  			<td>이름</td>
	  			<td>${board.b_writer }</td>
	  		</tr>
	  		<tr>
	  			<td>제목</td>
	  			<td>${board.b_title }</td>
	  		</tr>
	  		<tr>
	  			<td>내용</td>
	  			<% pageContext.setAttribute("newLine","\n"); %>
	  			<td>${ fn:replace(board.b_content, newLine, "<br>") }</td>
	  		</tr>
	  		<tr>
	  			<td>작성일</td>
	  			<td>${fn:split(board.b_date," ")[0] }</td>
	  		</tr>
	  		<tr>
	  			<td colspan="2" align="center">
	  				<button onClick="goList();">목록</button>
	  			</td>
	  		</tr>
	  	</table>
	
</body>
</html>