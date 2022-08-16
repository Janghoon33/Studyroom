import World from "./World";
import styles from "./Hello.module.css";
import { useState } from "react";
import UserName from "./UserName";
// const Hello = () => {
//     <p>Hello</p>
// }
// export default Hello;    <- 이렇게 써도 되고


export default function Hello({ age }){
    // let name = "Mike";
    const [name, setName] = useState('Mike');
    const msg = age > 19 ? "성인 입니다." : "미성년자 입니다.";

   return (
    // jsx 는 하나의 태그만 사용가능! div나 <></>(빈태그) 태그로 전체를 묶어주기
   <div>  
        <h2 id="name">{name}({age}):{msg}</h2>
        <UserName name={name}/>
        <button onClick={()=>{
             setName(name === "Mike" ? "Jane" : "Mike");
        }}>Change</button>
   </div>
   );
}
// 위처럼 써도 된다