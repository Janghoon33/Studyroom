<%@page import="com.smhrd.domain.Comm"%>
<%@page import="java.util.List"%>
<%@page import="com.smhrd.domain.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	//게시판 리스트(게시물 제목 클릭시) -> 특정 게시물 보는 페이지
	//꼭 게시물 번호를 넘겨줄수 있도록!
	BoardDAO dao = new BoardDAO();
	//현재 보고 있는 게시물의 좋아요 개수 불러오기	(게시물 번호를 매개인자)
	int like = dao.getLike(1);
	pageContext.setAttribute("like", like);
	
	//현재 보고 있는 게시물에 작성된 댓글 전부 불러오기 (게시물 번호를 매개인자)
	List<Comm> list = dao.selectAllComm(1);
	pageContext.setAttribute("list", list);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
</head>
<body>
	<button id='like'>좋아요</button><span>${like}</span>
    <br>
    <input type="text"><button class='writeCom'>댓글작성</button>
    <br>
    <div id="com">
    	<c:forEach var="comm" items="${list }">
    		<!-- comm.commentNum : 삭제를 할 때 서버로 삭제할 댓글의 번호를 넘겨주기 위해 사용 -->
    		<p><c:out value="${comm.com }"/><button class='removeCom' id='${comm.commentNum }'>삭제</button></p>
		</c:forEach>
    </div>  
    
    <script>
    $(document).on("click","#like",function(){ 
    	$.ajax({
			data : {status : "like", boardNum : 1},
			url : "LikeAjaxCon",
			method : "GET",
			dataType : "text",
			context : this,  //success 안에서 this(#like)를 사용하고 싶은 경우
			success: function(data){
				$('#like+span').text(data)
				$(this).text('좋아요 취소')
	            $(this).attr('id','dislike')	
			},
			error: function(){
				alert("통신실패!")
			}
		})
    });
    
    $(document).on("click","#dislike",function(){ 
        $.ajax({
			data : {status : "dislike", boardNum : 1},
			url : "LikeAjaxCon",
			method : "GET",
			dataType : "text",
			context : this,
			success: function(data){
					$('#dislike+span').text(data)
		            $(this).text('좋아요')
		            $(this).attr('id','like')
			},
			error: function(){
				alert("통신실패!")
			}
		})

    });
    
    $('.writeCom').click(function(){
    //사용자가 입력한 댓글 가지고오기
        var com = $('input[type=text]').val()
        
        $.ajax({
			data : {boardNum : 1, com : com},
			url : "AddCommentCon",
			method : "POST",
			success: function(data){  //data : 현재 추가된 댓글의 시퀀스 번호
				$('#com').prepend('<p>'+com+'<button class="removeCom" id='+data+'>삭제</button></p>')
	            $('input[type=text]').val("")
			},
			error: function(){
				alert("통신실패!")
			}
		})    
    })
    
    $('#com').on("click",".removeCom",function(){ 
    		//클릭한 삭제 버튼에 지정된 id속성값(삭제하고 싶은 댓글의 시퀀스 번호)
        	let commentNum = $(this).attr('id');
        	
            $.ajax({
				data : {commentNum:commentNum},
				url : "DeleteCommentCon",
				//restFul(get(정보 가지고오기)/post(삽입,수정-일부)/put(수정-전체)/patch(수정-일부)/delete(삭제)/)
				method : "post",
				context : this,
				success: function(){  //응답데이터가 없는 경우
					$(this).parent().remove()
				},
				error: function(){
					alert("통신실패!")
				}
			}) 
        });
    </script>
</body>
</html>