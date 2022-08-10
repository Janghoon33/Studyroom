import World from "./World";
import styles from "./Hello.module.css";
// const Hello = () => {
//     <p>Hello</p>
// }
// export default Hello;    <- 이렇게 써도 되고


export default function Hello(){
   return (
    // jsx 는 하나의 태그만 사용가능! div나 <></>(빈태그) 태그로 전체를 묶어주기
   <div>  
    <h1 style={
        {
            color : "#f00",
            borderRight : '2px solid #000',
            marginBottom : '30px',
            opacity : 1,
        }
    }>
        Hello
        </h1>
        <div className={styles.box}>Hello</div>
   </div>
   );
}
// 위처럼 써도 된다