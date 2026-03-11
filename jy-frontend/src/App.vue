<template>
  <div id="app">
    <h1>내 게시판 프로젝트</h1>
    <nav>
      <router-link to="/">홈</router-link> | 
      <router-link to="/add">글쓰기</router-link>
    </nav>

    <hr />

    <router-view />
  </div>
</template>

<script setup>
// 특별한 로직이 없다면 비워두셔도 됩니다.test
</script>

<style>
/* 간단한 디자인 */
nav { margin-bottom: 20px; }
#app { font-family: sans-serif; text-align: center; padding: 20px; }
</style>