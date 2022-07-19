<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
				<form class="form-horizontal" action="boardInsert.do" method="post">
					<div class="form-group">
						<label class="control-label col-sm-2" for="title">제목 :</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="b_title"
								placeholder="Enter title" name="b_title">
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-2" for="content">내용:</label>
						<div class="col-sm-10">
							<textarea name="content" id="b_content" rows="10" class="form-control"></textarea>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">Submit</button>
						</div>
					</div>
				</form>
			</div>
  </div>
</div>
</body>
</html>