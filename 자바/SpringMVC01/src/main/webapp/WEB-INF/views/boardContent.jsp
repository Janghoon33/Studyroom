<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
  <script type="text/javascript">
  	function goList(){
  		// boardList 페이지로 이동
  		// PathVariable을 사용중인 페이지에서는 /ContextPath/ 를 붙이자.
  		// / == http://localhost:8083/
  		location.href='/web/boardList.do'
  	}
  	function goDelete(idx) {
	
  		// controller가 가진 boardDelete.do 호출
  		// '/web/boardDelete.do?id3'
  		location.href = '/web/boardDelete.do?idx=' + idx;
  		
	}
  	
  	function goUpdate(idx){
  		location.href = '/web/boardGoUpdate.do?idx=' + idx;
  	}
  	
  </script>
  
  
</head>
<body>
 <%--
    EL은 scope(pageContext, request, session, application)에서 가져옴
    .getAttribute() 와 유사
    
    ${ scope.이름.필드명 }
    ${ 이름.필드명 }
        이름이 겹치면 
    pageContext < request < session < application
    유지시간이 짧은 scope의 것을 가져온다
     --%>

<div class="container">
  <h2>SpringMVC01</h2>
  <div class="panel panel-default">
    <div class="panel-heading">Panel Heading</div>
    <div class="panel-body">
    
   
	<table class="table table-hover">
		<tr class="table-bordered">
			<td> 제목 : </td>
			<td> ${ board.title } </td>
		</tr>		
		
		<tr class="table-bordered">
			<td> 작성자 : </td>		
			<td> ${ board.writer } </td>
		</tr>
		<tr class="table-bordered">
			<td> 내용 : </td>		
			<% pageContext.setAttribute("newLine","\n"); %>
			<td> ${ fn:replace( board.content, newLine, "<br>" ) } </td>
			<%-- fn:replace(대상 문자열, 바꿀 문자열, 바꾼뒤 문자열 ) --%> 
			<%-- \n을 replace하고 싶다면, scope에 문자열로써 담아뒀다가 꺼내서 써야됨--%>
		</tr>
		<tr class="table-bordered">
			<td> 작성일 : </td>		
			<td> ${ fn:split( board.indate , " ")[0] } </td>
			<%-- fn:split("대상 문자열", "구분자") --%>
			<%-- ["2022-06-21", "17:16:32"] --%>
		</tr>
		
		
		<tr>
			<td colspan="2" align="center">
				<button onClick="goUpdate(${board.idx})" class="btn btn-sm btn-info">수정</button>
				<button onClick="goDelete(${board.idx})"class="btn btn-sm btn-warning">삭제</button>
				<button onClick="goList();" class="btn btn-sm btn-success">목록</button>
			</td>
		</tr>
		
	</table>
	
    
    </div>
    <div class="panel-footer">빅데이터 고병갑</div>
  </div>
</div>

<%-- <script type="text/javascript">
	$('button').on('click', function(){
		
	});
</script> --%>


</body>
</html>
    