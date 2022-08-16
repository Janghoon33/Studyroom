import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import TodoBoard from './component/TodoBoard';


function App() {
  const [inputValue, setInputValue] = useState('')
  const [todoList,setTodoList] = useState([])

  const addItem = () =>{
    console.log("im hererere!", inputValue)
    setTodoList([...todoList,inputValue])
  }

  return (
    <div className='container'>
        <div className='list'>
          <TodoBoard todoList={todoList}/>

          <input type="text" name='ListItem' value={inputValue} 
        onChange={(event)=>setInputValue(event.target.value)} maxLength="25"/>
        
         <div id="button" onClick={addItem}>+</div> 
         </div>
    </div>
  );
}

export default App;
