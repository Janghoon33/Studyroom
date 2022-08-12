import World from "./World";
import styles from "./Hello.module.css";
// const Hello = () => {
//     <p>Hello</p>
// }
// export default Hello;    <- 이렇게 써도 되고


export default function Hello(){

    function showName(){
        console.log("Mike");
      }
      
      function showAge(age){
        console.log(age);
      }

    //   function showText(text){
    //     console.log(e.target.value)
    //   }
    //   타겟 : input 태그  value : 작성한값
    // return(<input type="text" onChange={(e)=>console.log(e.target.value)}/>)
    // 2 번째 방법
        function showText(txt){
            console.log(txt);
        }
   return (
    // jsx 는 하나의 태그만 사용가능! div나 <></>(빈태그) 태그로 전체를 묶어주기
   <div>  
    <h1>Hello</h1>
    <button onClick={showName}>Show name</button> 
    {/* 이벤트 적용 첫번째 방법 */}

    <button onClick={()=>
    {
        showAge(30)
    }}>Show age</button>   
     {/* 이벤트 적용 두번째 방법 : 매개변수를 전달하기 편함*/}
    <input type="text" onChange={e => {
        const txt = e.target.value;
        showText(txt);
    }}/>  
    
   </div>
   );
}
// 위처럼 써도 된다