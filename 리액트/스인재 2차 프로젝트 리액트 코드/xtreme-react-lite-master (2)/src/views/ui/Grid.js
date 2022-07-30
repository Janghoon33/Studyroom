import React, {useEffect, useState} from 'react'
import 'css/lest.css';
import { Link } from 'react-router-dom';


function Check(props) {
  const [name, setName] = useState("");
  
//  const join_name = sessionStorage.getItem("join_name");
  console.log(props.text)
  
 
useEffect(()=>{
  console.log("네임값 변경",name)
},[name])


const onSubmit = (event) => {
    event.preventDefault()
    
      return;
    
  }
  const url ="img/로공.jpg"
  return (
      <div className="loginregister">
        <form>
              <center><img src={url} className="Logo"></img></center>
              <br></br>
              <center><div className='Font'><b>회원가입이 완료 되었습니다.</b></div></center>
              <hr></hr>
              <center><p>  회원가입을 축하합니다</p></center>
              <center><p>알차고 실속있는 서비스로 찾아뵙겠습니다</p></center>
              <center>
                <div>
                  <Link to="/About">
                    <button type="submit" onSubmit={onSubmit} className="button1">로그인</button></Link> 
                    <Link to="/Starter"><button type="submit" onSubmit={onSubmit} className="button2">메인으로</button>
                  </Link>
                </div>
              </center>
        </form>
      </div>
    );
  }

export default Check;