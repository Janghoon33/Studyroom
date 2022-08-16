import World from "./World";
import styles from "./Hello.module.css";
import { useState } from "react";
// const Hello = () => {
//     <p>Hello</p>
// }
// export default Hello;    <- 이렇게 써도 되고


export default function Hello(){
    // let name = "Mike";
    const [name, setName] = useState('Mike');

   return (
    // jsx 는 하나의 태그만 사용가능! div나 <></>(빈태그) 태그로 전체를 묶어주기
   <div>  
        <h2 id="name">{name}</h2>
        <button onClick={()=>(
             setName(name === "Mike" ? "Jane" : "Mike")
        )}>Change</button>
   </div>
   );
}
// 위처럼 써도 된다