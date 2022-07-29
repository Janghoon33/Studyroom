<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="panel panel-default">
    <div class="panel-body">
            <form class="form-horizontal" action='/seniorinsert.do' method="post" enctype="multipart/form-data"> 
               <div class="form-group">
                  <label class="control-label col-sm-2" for="title">이름 :</label>
                  <div class="col-sm-10">
                     <input type="text" class="form-control" id="S_name"
                        placeholder="Enter name" name="S_name" size="20">
                  </div>
               </div>
               
               <div class="form-group">
                  <label class="control-label col-sm-2" for="birth">생년월일 :</label>
                  <div class="col-sm-10">
                  <input type="text" class="form-control" id="S_birth"
                        placeholder="Enter birth" name="S_birth" size="20">
                     
                  </div>
               </div>
               <div class="form-group">
               <input type="checkbox" name="S_gender" id = "S_gender" value="남성"/>남성
               <input type="checkbox" name="S_gender" id = "S_gender" value="여성"/>여성
               <%-- <div radiobuttons path="S_gender" items="${S_gender}"/> --%>
               </div>
               <div class="form-group">
                  <label class="control-label col-sm-2" for="photo">이미지 :</label>
                     <input type="file" class="form-control" id="photo"
                        placeholder="Enter care" name="photo" size="20">
                  </div>

               
               
               <div class="form-group">
                  <label class="control-label col-sm-2" for="phone">보호자 전화번호:</label>
                  <div class="col-sm-10">
                     <input type="text" class="form-control" id="S_phone"
                        placeholder="Enter phone" name="S_phone" size="20">
                  </div>
               </div>
               <div class="form-group">
                  <label class="control-label col-sm-2" for="address">주소:</label>
                  <div class="col-sm-10">
                     <input type="text" class="form-control" id="S_address"
                        placeholder="Enter address" name="S_address" size="20">
                  </div>
               </div>
               <div class="form-group">
                  <label class="control-label col-sm-2" for="care">특이사항 :</label>
                  <div class="col-sm-10">
                     <input type="text" class="form-control" id="S_care"
                        placeholder="Enter care" name="S_care" size="20">
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
</body>
</html>