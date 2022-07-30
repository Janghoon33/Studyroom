import React, {useEffect, useState} from 'react'
import "css/LoginRegister.css"
import { Link, Navigate, useLocation } from "react-router-dom";
import Axios from "axios";
import $ from "jquery";
import Header from 'layouts/Header'; 
import App from 'App';

function Login() {
  const [inputId, setInputId] = useState("");
  const [inputPw, setInputPw] = useState(""); 


  const onEmailHandler = (e) => {
    setInputId(e.target.value);
  }

  const onPasswordHandler = (e) => {
    setInputPw(e.target.value)
}




  let param = {};

  useEffect(()=>{
  

  
    $(".loginregister__button1").on('click',function () {      //마우스 누를떼 

      param.mem_id = $("div.loginregister__id > input:eq(0)").val()
      param.mem_pw = $("div.loginregister__pw > input:eq(0)").val()


      console.log(param);
      
      Axios.post("/api/memberLogin",param).then((res)=>{
        console.log("리턴",res);
        sessionStorage.setItem('mem_id', res.data.mem_id);
        sessionStorage.setItem('mem_name', res.data.mem_name);
        sessionStorage.setItem('mem_phone', res.data.mem_phone);
        sessionStorage.setItem('mem_address', res.data.mem_address);
        // let user = sessionStorage.getItem('mem_id');
        // console.log("id",user);
        
      // 작업 완료 되면 페이지 이동(새로고침)
       document.location.href = '/'
      });
      
    });

    

  },[]);
   return (
    <div className="loginregister2"> 
        <form>
            <center className="title1"><h1> Login </h1></center>
            <br></br>
            <br></br>
            <div className="loginregister__id"><input name="mem_id" type="text" placeholder="아이디" value={inputId} onChange={onEmailHandler} className="loginregister__input"/></div>
            <div className="loginregister__pw"><input name="mem_pw" type="password" placeholder="비밀번호" value={inputPw} onChange={onPasswordHandler} className="loginregister__input"/></div>
            <br></br>
            <br></br>
            <div>
            <Link to="/"><button type="submit" className="loginregister__button1" >로그인</button></Link>
            <Link to="/Breadcrumbs"><button type="button" className="loginregister__button5">회원가입</button></Link></div>
        </form>
      </div>
      
  );
};

export default Login;