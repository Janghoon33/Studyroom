<%@page import="com.board.test.domain.Board"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>게시판 목록보기</title>
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
<body>
	<h2>게시판 글 목록</h2>
	
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>작성일자</th>
			<th>첨부파일</th>
		</tr>
		<c:forEach var="board" items="${board }">
		<tr>
			<td><c:out value="${board.b_num }"/></td>
			<td><c:out value="${board.b_title }"/></td>
			<td><c:out value="${board.b_content}"/></td>
			<td><c:out value="${board.b_writer }"/></td>
			<td><c:out value="${board.b_date }"/></td>
			<td><c:out value="${board.b_file }"/></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>