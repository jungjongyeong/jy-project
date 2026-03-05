<script setup lang="ts">
import { ref, onMounted } from 'vue'
import axios from 'axios'

// 1. 데이터를 저장할 변수
const serverData = ref('데이터를 불러오는 중...')

// App.vue의 onMounted 부분
onMounted(async () => {
  try {
    // 이제 루트("/")가 아니라 데이터를 주는 특정 주소를 호출해야 합니다.
    // 아직 API를 안 만드셨다면 이 줄을 잠시 주석 처리하거나 아래처럼 바꾸세요.
    // const response = await axios.get('https://localhost:8080/') 
    serverData.value = "연결 완료! 이제 DB 데이터를 가져올 준비가 됐습니다."
  } catch (error) {
    serverData.value = '연결 실패'
  }
})
</script>

<template>
  <div style="text-align: center; margin-top: 50px;">
    <h1>Vue + Spring Boot 연동 성공123!</h1>
    <div style="padding: 20px; background-color: #f0f0f0; border-radius: 10px;">
      <h3>백엔드로부터 받은 데이터:</h3>
      <p style="color: blue; font-weight: bold;">{{ serverData }}</p>
    </div>
  </div>
</template>