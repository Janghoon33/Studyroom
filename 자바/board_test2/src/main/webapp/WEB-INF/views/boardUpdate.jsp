<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h2>게시판 글 작성</h2>
  <div class="panel panel-default">
    <div class="panel-body">
				<form class="form-horizontal" action='writeAction.do' method="post">
					
					<input type="hidden" name="b_num" value="${board.b_num }">
					
					<div class="form-group">
						<label class="control-label col-sm-2" for="title">제목 :</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="b_title"
								value="${board.b_title }" name="b_title" size="20">
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-2" for="content">내용:</label>
						<div class="col-sm-10">
							<textarea name="b_content" id="b_content" rows="10" class="form-control">${board.b_content}</textarea>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">Submit</button>
							<button onclick = "location.href='/boardList'">목록보기</button>
						</div>
					</div>
				</form>
			</div>
  </div>
</body>
</html>