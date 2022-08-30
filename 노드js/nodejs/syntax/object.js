// 배열은 순서가 있게 정보를 저장
// 객체는 순서없이 정보를 저장

var members = ['jh', 'kkkkkk0', 'yaho']
console.log(members[1]); // kkkkkk0
var i = 0;
while(i < members.length){
  console.log('array loop', members[i]);
  i = i + 1;
}

var roles = {
  'programmer':'jh',
  'designer' : 'kkkkkk0',
  'manager' : 'yaho'
}
console.log(roles.designer);
console.log(roles['designer']);

for(var name in roles){
  console.log('object => ' , name, 'value => ', roles[name]);
}
