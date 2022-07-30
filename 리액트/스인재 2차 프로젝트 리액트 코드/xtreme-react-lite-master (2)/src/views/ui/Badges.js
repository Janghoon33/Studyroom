import { useState,useEffect } from 'react';
import 'css/lest.css';
import { CKEditor } from '@ckeditor/ckeditor5-react';
import ClassicEditor from '@ckeditor/ckeditor5-build-classic';
import { Link } from 'react-router-dom';
import Axios from "axios";
import $ from "jquery";



// 게시글 작성 Page

function Review() {
  const mem_id = sessionStorage.getItem('mem_id')
  const mem_address = sessionStorage.getItem('mem_address')
  const mem_name = sessionStorage.getItem('mem_name')
  const mem_phone = sessionStorage.getItem('mem_phone')

let param = {};

useEffect(()=>{

    $(".submit-button2").on('click',function (){
        param.b_title = $("div.form-wrapper > input:eq(0)").val()
        param.b_content = $("textarea.b_cont").val()
        param.b_writer = (sessionStorage.getItem('mem_id'))
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
  <h1>Use Review</h1>
  
  <div className='form-wrapper'>
    <input className="title-input" 
            type='text' 
            placeholder='제목' 
            // onChange={getValue}
            name='b_title'
    />
    <br></br>
    <textarea className="b_cont" rows="15" cols="90">
    </textarea>
  
  </div>
  <br></br>
  <Link to="/Table">
              <button type="button" className="submit-button1">
                    목록
              </button>
 </Link>

 <Link to="/Table"> 
  <button type="submit" className="submit-button2">작성하기</button>
 </Link>
</div>
);
}


export default Review;