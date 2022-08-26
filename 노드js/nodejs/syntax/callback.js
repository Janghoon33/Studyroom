// function a(){
//   console.log('A');
// }
var a = function (){
  console.log('A');
} // 이름이 없는 함수 익명함수


function slowfunc(callback){
  callback();
}
slowfunc(a);
