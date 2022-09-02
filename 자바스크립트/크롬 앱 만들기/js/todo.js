const toDoForm = document.getElementById("todo-form");
const toDoInput = toDoForm.querySelector("input"); // document.getElementById("#todo-form input")이랑 같음
const toDoList = document.getElementById("todo-list");

const TODOS_KEY = "todos"

let toDos = [];

function saveToDos() {
    localStorage.setItem("todos", JSON.stringify(toDos)); // 배열이나 자바스크립트 값을 string으로 바꿔주는 기능
}

function deleteTodo(event){
     const li = event.target.parentElement;
     li.remove();
     toDos = toDos.filter(toDo => toDo.id !== parseInt(li.id));
     saveToDos();
}

function paintTodo(newTodo) {
    const li = document.createElement("li");
    li.id = newTodo.id;
    const span = document.createElement("span");
    span.innerText = newTodo.text;
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
    const newTodoObj = {
        text : newTodo,
        id : Date.now(),
    };
    toDos.push(newTodoObj);  // array에 Todo 입력값 넣어주기
    paintTodo(newTodoObj);
    saveToDos();
}

toDoForm.addEventListener("submit", handleToDoSubmit);

function sayHello(item) {
    console.log("this is turn of ", item);
} // -> 줄이는 방법 array function

const savedToDos = localStorage.getItem(TODOS_KEY);

if(savedToDos !== null){
    const parsedToDos = JSON.parse(savedToDos); // String을 살아있는 자바스크립트 배열로 바꿔주는 기능(parse)
    toDos = parsedToDos;
    parsedToDos.forEach(paintTodo); // array의 각각 item에 대해 function 실행해주는 기능
}

