import { useState,useEffect } from 'react';
import 'css/lest.css';
import { CKEditor } from '@ckeditor/ckeditor5-react';
import ClassicEditor from '@ckeditor/ckeditor5-build-classic';
import { Link } from 'react-router-dom';
import Axios from "axios";
import $ from "jquery";



// 게시글 작성 Page

function Review() {

let param = {};

useEffect(()=>{

    $(".submit-button2").on('click',function (){
        param.b_title = $("div.form-wrapper > input:eq(0)").val()
        param.b_content = $("textarea.b_cont").val()
        console.log("=======================gd")
        console.log(param);
        console.log($("div.form-wrapper > input:eq(0)").val());
        console.log($("textarea.b_cont").val());
  

      Axios.post("/api/boardInsert", param).then((response)=>{
        if(response.data){
          console.log(response.data);
        }else{
          alert("failed to");
        }
      })
    })
},[])

return (
<div className="App">
  <h1>글 작성하기</h1>
  
  <div className='form-wrapper'>
    <input className="title-input" 
            type='text' 
            placeholder='제목' 
            // onChange={getValue}
            name='b_title'
    />
    <textarea className="b_cont" rows="15" cols="15">
    </textarea>
  
  </div>
  <Link to="/Table">
              <button type="button" className="submit-button1">
                    목록
              </button>
 </Link>

 <Link to="/Table"> 
  <button type="submit" className="submit-button2">작성</button>
 </Link>
</div>
);
}


export default Review;