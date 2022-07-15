<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
   body{background: whitesmoke; text-align: center;}
   fieldset {border:3px dotted blue;}
   div > button{ width: 100px; height: 100px; }
</style>
</head>
<body>
   <form>
      <fieldset>
      <c:choose>
       <legend><h2>${loginMember.nick }님 환영합니다!</h2></legend>          
      <div>
      <c:if test="${loginMember.nick eq 'admin'}">
            <button>회원관리</button>
            <button>도서관리</button>
            <button>대여관리</button>
            <button>재고관리</button>
       </c:if>
       <otherwise>
            <button>도서검색</button>
            <button>나의책방</button>
            <button>즐겨찾기</button>
            <button>회원정보</button>
      </otherwise>
      
      </c:choose>   
         </div>
      </fieldset>
   </form>
</body>
</html>


            