// array, object

// 자바스크립트에서 function이라는 statement가 값이 될수있음
var f = function f1() {
  console.log(1+1);
  console.log(1+2);
}
console.log(f);

var a = [f];
a[0]();

var o = {
  func:f
}
o.func();
