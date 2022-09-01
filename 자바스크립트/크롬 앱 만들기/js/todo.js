const toDoForm = document.getElementById("todo-form");
const toDoInput = toDoForm.querySelector("input"); // document.getElementById("#todo-form input")이랑 같음
const toDoList = document.getElementById("todo-list");

const toDos = [];

function deleteTodo(event){
     const li = event.target.parentElement;
     li.remove();
}

function paintTodo(newTodo) {
    const li = document.createElement("li");
    const span = document.createElement("span");
    span.innerText = newTodo;
    const button = document.createElement("button");
    button.innerText = "❌";
    button.addEventListener("click", deleteTodo)
    li.appendChild(span); // append는 마지막에 두기
    li.appendChild(button);
    toDoList.appendChild(li);
}

function handleToDoSubmit(event) {
    event.preventDefault();
    const newTodo = toDoInput.value;
    toDoInput.value = "";
    paintTodo(newTodo)
}

toDoForm.addEventListener("submit", handleToDoSubmit);