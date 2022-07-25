import { useState } from 'react';
import './App.css';

function App() {

  let post = '강남 우동 맛집'; // 자료 잠깐 저장할때 변수 사용
  let [글제목, 글제목변경] = useState(['남자 코트 추천','강남 우동 맛집','파이썬독학' ]); // 글제목 -> state에 담은 변수 이름, b-> state 변경을 도와주는 함수
// state 사용 이유 : 변수와 다르게 자동으로 재렌더링됨! 자주 바뀌는 html 요소를 state로 쓰기
  let [따봉, 따봉변경] = useState(0);



  return (

    <div className="App">
      <div className="black-nav"> {/*  jsx에서는 클래스를 className으로 씀*/}
          <h4 style={ { color : 'red', fontSize : '20px' } }>ReactBlog</h4>  {/* style 넣을 땐 style={{스타일명:'값'}} 폰트 사이즈 쓸때 - 안쓰고 붙여서 씀  */}
      </div>

      <button onClick={()=>{
          let copy = [...글제목];  // array나 object 를 다룰땐 원본은 보존하는게 좋음
          copy[0] = '여자 코트 추천';
          글제목변경(copy);
        }}> 글수정🌞 </button>
      <div className='list'> {/* 변수를 넣을 땐(데이터 바인딩) {중괄호}*/}
        <h4> { 글제목[0] } <span onClick={ ()=>{ 따봉변경(따봉+1) } }>👍</span> {따봉} </h4> 
        {/* onclick 안에는 함수 넣기,  state는 등호로 변경x, state변경할땐 변경함수 쓰기 */}
        <p>7월 24일 발행</p>
      </div>
      <div className='list'>
        <h4>{ 글제목[1] }</h4>
        <p>7월 24일 발행</p>
      </div>
      <div className='list'>
        <h4>{ 글제목[2] }</h4>
        <p>7월 24일 발행</p>
      </div>

      <Modal/> {/*컴포넌트 어떨때 쓸까
            1. 반복적인 html 축약할 때
            2. 큰 페이지들
            3. 자주 변경되는 것들
            단점
            state 가져다 쓸 때 문제생김
      */}
      

      {/* return()안에는 병렬로 태그 2개 이상 기입 금지 */}
    </div>  
  );
}


function Modal(){
  return(
      <div className="modal">
      <h4>제목</h4>
      <p>날짜</p>
      <p>상세내용</p>
    </div>
  )
}

export default App;
