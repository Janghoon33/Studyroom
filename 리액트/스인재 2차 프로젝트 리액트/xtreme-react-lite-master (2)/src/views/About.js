import React, {useEffect, useState} from 'react'
import "css/LoginRegister.css"
import { Link, useLocation } from "react-router-dom";

function Login(props) {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState(""); 

  console.log(props.text)

  const onEmailHandler = (event) => {
    setEmail(event.currentTarget.value);
  }

  const onPasswordHandler = (event) => {
    setPassword(event.currentTarget.value)
}

const onSubmit = (event) => {
    event.preventDefault()
    if(password !== confirmPassword) {
      return alert('비밀번호와 비밀번호확인은 같아야 합니다.');
    }
  }
  let i=1 // 로그인 로고 지우기 = 0, 보이기 = 1
   return (
    <div className="loginregister2"> 
        <form>
            <center className="title1"><h1> Login </h1></center>
            <br></br>
            <br></br>
            <br></br>
            <div><input name="email" type="email" placeholder="이메일" value={email} onChange={onEmailHandler} className="loginregister__input"/></div>
            <div><input name="password" type="password" placeholder="비밀번호" value={password} onChange={onPasswordHandler} className="loginregister__input"/></div>
            <br></br>
            <br></br>
            <br></br>
            <div>
            {i===1?<button type="submit" onSubmit={onSubmit} className="loginregister__button1">로그인</button>:null}  {/*로그인 설계*/}
            <Link to="/Breadcrumbs"><button type="button" className="loginregister__button5">회원가입 하기</button></Link></div>
        </form>
      </div>
  );
};

export default Login;
