import './App.css';
import React, { useState } from 'react';

function App() {

  let [num, setNum] = useState(0);
  
  const [numList, setNumList] = useState([]);

  function numRecording(){
    setNumList([...numList, num]);

    setNum(0);
  }

  return (
    <div className="App">
      <div>현재 숫자 : {num}</div>
      <br/>
      <button onClick={() => {setNum(num + 1)}}>증가</button>
      <button onClick={() => {setNum(num - 1)}}>감소</button>
      <button onClick={numRecording}>기록</button>
      <h2>저장된 숫자</h2>
      <ul>
        {numList.map((num)=>(
          <li>{num}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
