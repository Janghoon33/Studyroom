import React, {useEffect, useState} from 'react'
import "css/LoginRegister.css"
import DaumPost  from 'modals/DaumPost';
import { Link } from 'react-router-dom';
import Axios from "axios";
import $ from "jquery";




const SelectBox = (props) => {
   return (
      <select>
         {props.options.map((option) => (
            <option
               key={option.value}
               value={option.value}
            >
               {option.name}
            </option>
         ))}
      </select>
   );
};

function Singup() {
  const [mem, setMember] = useState("");

  let param = {};
  /*

  */
  useEffect(()=>{
  
  
    $(".loginregister__button").on('click',function () {      //마우스 누를떼 
      console.log($("div.loginregister__id > input:eq(0)").val());
      console.log($("div.loginregister__email > input:eq(0)").val());
      console.log($("div.loginregister__pw > input:eq(0)").val());
      param.mem_id = $("div.loginregister__id > input:eq(0)").val()
      param.mem_pw = $("div.loginregister__pw > input:eq(0)").val()
      param.mem_name = $("div.loginregister__name > input:eq(0)").val()
      param.mem_email = $("div.loginregister__email > input:eq(0)").val()
      param.mem_address = $("div.loginregister__address > input:eq(0)").val()
      param.mem_phone = $("div.loginregister__phone > input:eq(0)").val()
      
      console.log(param);
      
      Axios.post("/api/memberInsert",param).then((response)=>{
        if(response.data){
          console.log(response.data);
          // sessionStorage.setItem('join_name',  "김정훈4");
          //setUser(response.data);
        }else{
          alert("failed to ");
        }
      });
      
     });

  },[]);

  const [enroll_company, setEnroll_company] = useState({
    address:'',
  });

  const [popup, setPopup] = useState(false);

  const handleInput = (e) => {
    setEnroll_company({
        ...enroll_company,
          [e.target.name]:e.target.value,
      })
  }
  
  const handleComplete = (data) => {
      setPopup(!popup);
  }

  return (
      <div className="loginregister">
        
        <form>
          <br></br>
              <center><h3> 회원가입 </h3></center>
              <hr></hr>
            <div className="loginregister__id"><input name="mem_id" type="text" placeholder="아이디" className="loginregister__input" /></div>
            <div className="loginregister__email"><input name="mem_email" type="email" placeholder="이메일" className="loginregister__input"/></div>
            <div className="loginregister__pw"><input name="mem_pw" type="password" placeholder="비밀번호" className="loginregister__input"/></div>
            <div className="loginregister__name"><input name="mem_name" type="text" placeholder="성명" className="loginregister__input"/></div>
            <div className="loginregister__phone"><input name="mem_phone" type="text" placeholder="전화번호" className="loginregister__input"/></div> 
            <div className="loginregister__address"> <input className="user_enroll_text" placeholder="주소"  type="text" required={true} name="address" onChange={handleInput} value={enroll_company.address}/>
            <button onClick={handleComplete}>우편번호 찾기</button>
            {popup && <DaumPost company={enroll_company} setcompany={setEnroll_company}></DaumPost>}</div> 
            <div className="loginregister__address"><input name="mem_address" type="text" placeholder="상세주소 쓰기" className="loginregister__input2"/></div> 
            <br></br>
            <div><Link to="/Grid"><button type="submit" className="loginregister__button">가입하기</button></Link></div>
            
        </form>
      </div>

    );
    
  }

  
export default Singup;