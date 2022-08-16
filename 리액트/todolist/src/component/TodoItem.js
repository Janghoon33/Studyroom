import React from 'react';
//rsf
function TodoItem(props) {
    return (
        <div className='todo-item'>

            <input type="checkbox"/>
            <label for="checkbox">
            {props.item}
            </label>
            
        </div>
    );
}

export default TodoItem;