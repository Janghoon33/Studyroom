<template>
  <div class="menu">
    <a v-for="(변수,b) in menus" :key="b">{{ b }}</a>
  </div>
  
  <div v-for="상품 in products" :key="상품" >
    <h4 :style="스타일" >{{ 상품 }}</h4>  
    <p>60 만원</p>
  </div>
</template>

<script>

export default {
  name: 'App',
  data(){ // 데이터 보관함
    return {
      prices : [70,80,90],
      스타일 : 'color : blue',
      menus : ['Home','Shop','About'],
      products : ['역삼동원룸', '천호동원룸', '마포구원룸' ],
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
