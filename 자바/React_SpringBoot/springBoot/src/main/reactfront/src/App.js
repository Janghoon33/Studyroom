import logo from './logo.svg';
import './App.css';
import React, { useState } from 'react';

function App() {

  let [num, setNum] = useState(1);
  
  return (
    <div className="App">
      <header className="App-header">
        <div className='number'>{ num }</div>     
      </header>
    </div>
  );
}

export default App;
