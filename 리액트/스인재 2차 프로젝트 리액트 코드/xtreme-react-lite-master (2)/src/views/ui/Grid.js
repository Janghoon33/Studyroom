import React, {useEffect, useState} from 'react'
import 'css/lest.css';
import { Link } from 'react-router-dom';


function Check(props) {
  const [name, setName] = useState("");
  

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
              <br></br>
              <center><p> 나태린님의 회원가입을 축하합니다 👀</p></center>
              <center><p>알차고 실속있는 서비스로 찾아뵙겠습니다 🌎</p></center>
              <center><div><Link to="/About">
              <button type="submit" onSubmit={onSubmit} className="button1">로그인 하기</button></Link> 
              <Link to="/Starter"><button type="submit" onSubmit={onSubmit} className="button2">메인으로 이동</button></Link></div>
              </center>
        </form>
      </div>
    );
  }

export default Check;