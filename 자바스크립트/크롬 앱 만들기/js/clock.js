const clock = document.querySelector("h2#clock");
// 변수 한번에 수정 : Ctrl + Shift + L
function getClock() {
    const date = new Date();
    const hours = String(date.getHours()).padStart(2,"0");  // padStart(2,"0") : 앞 "문자"가 2글자가 아니면 앞에 "0"을 붙임
    const minutes = String(date.getMinutes()).padStart(2,"0");
    const seconds = String(date.getSeconds()).padStart(2,"0");

    clock.innerText = `${hours}:${minutes}:${seconds}` ;
}

getClock();
setInterval(getClock, 1000); // 1초마다 getClock을 실행