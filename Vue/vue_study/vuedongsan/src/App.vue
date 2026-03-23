<template>
  <div class="black-bg" v-if="모달창 == true">
    <div class="white-bg">
      <h4>상세페이지임</h4>
      <p>상세페이지 내용임</p>
      <br>
      <button @click="모달창 = false">닫기</button>
    </div>
  </div>

  <div class="menu">
    <a v-for="a in menus" :key="a">{{ a }}</a>
  </div>
  <div v-for="a in 원룸들" :key="a">
    <img :src="a.image" class="room-img">
    <h4>{{ a.title }}</h4>  
    <p>{{ a.price }}원</p>
  </div>
</template>

<script>

import data from './assets/oneroom.js';

export default {
  name: 'App',
  data(){ // 데이터 보관함 == react의 state
    return {
      원룸들 : data,
      모달창 : false,
      신고수 : [0,0,0],
      스타일 : 'color : blue',
      menus : ['Home','Shop','About'],
      products : ['역삼동원룸', '천호동원룸', '마포구원룸' ],
    }
  },
  methods: { // vue 함수 공간
    
  },
  components: {
  }
}
</script>

<style>
body{
  margin: 0
}
div {
  box-sizing: border-box;
}
.black-bg {
  width: 100%; height: 100%;
  background: rgba(0,0,0,0.5);
  position: fixed; padding: 20px;
}
.white-bg{
  width: 100%; background: white;
  border-radius: 8px;
  padding: 20px;
}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
.menu {
  background: darkslateblue;
  padding: 15px;
  border-radius: 5px;
}
.menu a {
  color: white;
  padding: 10px;
}
.room-img {
  width: 40%;
  margin-top: 40px;
}
</style>
