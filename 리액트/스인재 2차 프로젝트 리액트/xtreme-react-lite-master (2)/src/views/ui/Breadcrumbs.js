import React, {useEffect, useState} from 'react'
import "css/LoginRegister.css"
import DaumPost  from 'modals/DaumPost';
import { Link } from 'react-router-dom';


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

function Singup(props) {
  const [id, setId] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState(""); 
  const [confirmPassword, setConfirmPassword] = useState("")
  const [name, setName] = useState("")
  const [tel,setTel ] = useState("")
  const [address,setAddress ] = useState("")

  console.log(props.text)
  
  const onIdHandler = (event) => {
    let id = setId(event.currentTarget.value);
    console.log(id)
  }

  const onEmailHandler = (event) => {
    setEmail(event.currentTarget.value);
  }

  const onPasswordHandler = (event) => {
    setPassword(event.currentTarget.value)
}

const onConfirmPasswordHandler = (event) => {
    setConfirmPassword(event.currentTarget.value)
}

const onNameHandler = (event) => {
    setName(event.currentTarget.value)
}

const onTelHandler = (event) => {
    setTel(event.currentTarget.value)
}

const onAddressHandler = (event) => {
    setAddress(event.currentTarget.value)
}

useEffect(()=>{
  console.log("네임값 변경",id)
},[id])


const onSubmit = (event) => {
    event.preventDefault()
    if(password !== confirmPassword) {
      return alert('비밀번호와 비밀번호확인은 같아야 합니다.');
    }
  }

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
              <center><h1> 회원가입 </h1></center>
            <div><input name="id" type="text" placeholder="아이디" value={id} onChange={onIdHandler} className="loginregister__input"/></div>
            <div><input name="email" type="email" placeholder="이메일" value={email} onChange={onEmailHandler} className="loginregister__input"/></div>
            <div><input name="password" type="password" placeholder="비밀번호" value={password} onChange={onPasswordHandler} className="loginregister__input"/></div>
            <div><input name="confirmPassword" type="password" placeholder="비밀번호 확인" value={confirmPassword} onChange={onConfirmPasswordHandler} className="loginregister__input"/></div>
            <div><input name="name" type="text" placeholder="성명" value={name} onChange={onNameHandler} className="loginregister__input"/></div>
            <div><input name="tel" type="text" placeholder="전화번호" value={tel} onChange={onTelHandler} className="loginregister__input"/></div> 
            <div className="address_search" >  
            <input className="user_enroll_text" placeholder="주소"  type="text" required={true} name="address" onChange={handleInput} value={enroll_company.address}/>
            <button onClick={handleComplete}>우편번호 찾기</button>
            {popup && <DaumPost company={enroll_company} setcompany={setEnroll_company}></DaumPost>}</div>
            <div><input name="address" type="text" placeholder="상세주소 쓰기" value={address} onChange={onAddressHandler} className="loginregister__input2"/></div> 
            <div><Link to="/Grid"><button type="submit" onSubmit={onSubmit} className="loginregister__button">가입완료</button></Link></div>
            
        </form>
      </div>
    );
  }

export default Singup;