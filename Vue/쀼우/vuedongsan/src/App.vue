<template>
  <div class="menu">
    <a v-for="(변수,b) in menus" :key="b">{{ b }}</a>
  </div>
  
  <div v-for="a in products" :key=a>
    <h4 :style="스타일" >{{ a }}</h4>  
    <p>월 60 만원</p>
    <button @:click="increase">허위매물신고</button> <span>신고수 : {{ 신고수 }}</span>
  </div>
</template>

<script>

export default {
  name: 'App',
  data(){ // 데이터 보관함
    return {
      신고수 : 0,
      스타일 : 'color : blue',
      menus : ['Home','Shop','About'],
      products : ['역삼동원룸', '천호동원룸', '마포구원룸' ],
    }
  },
  methods: { // vue 함수 공간
    increase(){
      this.신고수++;
    }
  },
  components: {
  }
}
</script>

<style>
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
</style>
