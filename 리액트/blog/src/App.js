import './App.css';

function App() {

  let post = '강남 우동 맛집';
  
  return (

    <div className="App">
      <div className="black-nav"> {/*  jsx에서는 클래스를 className으로 씀*/}
          <h4 style={ { color : 'red', fontSize : '20px' } }>블로그임</h4>  {/* style 넣을 땐 style={{스타일명:'값'}} 폰트 사이즈 쓸때 - 안쓰고 붙여서 씀  */}
      </div>
      <h4>{ post }</h4> {/* 변수를 넣을 땐(데이터 바인딩) {중괄호}*/}
    </div>
  );
}

export default App;
