/* 
호이스팅 : 함수가 실행되기전에 안에 있는 변수들을 범위의 최 상단으로 끌어올리는것!

const : 상수를 만듬, 변하고 싶지 않은 값을 넣을 때 쓰임
var : 함수만 지역변수로 호이스팅이 되고 나머지는 다 전역변수로 올림, 
let : var 예제2 같은 문제점 해결, let도 호이스팅이 됨, 그러나 TDZ(Temporal Death Zone)을 이용해서 호이스팅 해결

*/ 
console.log(a); // 실행값 : undefined 9번째줄의 코드없이 실행하면 에러뜸 js는 호이스팅시 변수의 선언과 초기화를 같이 시켜버림
var a = 1
console.log(a); // 실행값 : 1

// 밑의 코드도 똑같이 실행됨
console.log(a);
a = 1
var a
console.log(a);


// var 예제1
for(var i = 1; i<5; i++){
    console.log(i);
}
console.log(i); // 실행됨(오류)

// var 예제2
var b = 2
console.log(b); 
var b = 3
console.log(b); // var의 문제점 : 변수값이 중복되도 넘어감 (재선언)

// let 예제 1
for(let i=1; i<5; i++){
    console.log(i);
}
console.log(i); // 오류뜸! i는 for문안의 지역변수(정상)

// let 예제 2
console.log(c); // c를 선언(초기화)이 나올때까지 c를 쓸수 없다  (TDZ이기 때문에 C에 접근불가능)
let c = 1
console.log(c); 
