import { useState } from 'react';
import './App.css';

function App() {

  let post = '강남 우동 맛집'; // 자료 잠깐 저장할때 변수 사용
  let [글제목, 제목변경] = useState(['남자 코트 추천','강남 우동 맛집','파이썬독학','여자코트추천' ]); // 글제목 -> state에 담은 변수 이름, b-> state 변경을 도와주는 함수
// state 사용 이유 : 변수와 다르게 자동으로 재렌더링됨! 자주 바뀌는 html 요소를 state로 쓰기
  let [따봉, 따봉변경] = useState(0);



  return (

    <div className="App">
      <div className="black-nav"> {/*  jsx에서는 클래스를 className으로 씀*/}
          <h4 style={ { color : 'red', fontSize : '20px' } }>ReactBlog</h4>  {/* style 넣을 땐 style={{스타일명:'값'}} 폰트 사이즈 쓸때 - 안쓰고 붙여서 씀  */}
      </div>
      <div className='list'> {/* 변수를 넣을 땐(데이터 바인딩) {중괄호}*/}
        <h4><span onClick={ ()=>{ 제목변경(글제목[4] ) } }> 🌞 </span>{ 글제목[0] } <span onClick={ ()=>{ 따봉변경(따봉+1) } }>👍</span> {따봉} </h4> 
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

      

      {/* return()안에는 병렬로 태그 2개 이상 기입 금지 */}
    </div>  
  );
}

export default App;
