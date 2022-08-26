console.log(Math.round(1.6)); // 2
console.log(Math.round(1.4)); // 1
// round : 반올림함수

function sum(first,second){ // parameter(매개변수)
  console.log('a');
  return first+second; // 리턴을 만나면 함수 종료됨 (b는 출력안됨)
  console.log('b');
}

console.log(sum(2,4)); // argument(인자)
