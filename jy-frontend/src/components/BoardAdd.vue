<template>
  <div class="board-add">
    <h2>게시글 작성하기</h2>
    <div class="form-group">
      <input v-model="board.title" placeholder="제목을 입력하세요" />
    </div>
    <div class="form-group">
      <textarea v-model="board.content" placeholder="내용을 입력하세요"></textarea>
    </div>
    <div class="form-group">
      <input v-model="board.writer" placeholder="작성자" />
    </div>
    <button @click="saveBoard">저장하기</button>
  </div>
</template>

<script setup>
import { ref } from 'vue';
import axios from 'axios';

const board = ref({
  title: '',
  content: '',
  writer: ''
});

const saveBoard = async () => {
  try {
    // 어제 테스트했던 그 주소입니다!
    // 도메인 주소로 직접 보냅니다. (포트 번호는 생략하거나 Nginx 포트를 사용)
    const response = await axios.post('/api/add', board.value);
    console.log('저장 성공:', response.data);
    alert('게시글이 성공적으로 저장되었습니다!');
    
    // 입력창 초기화
    board.value = { title: '', content: '', writer: '' };
  } catch (error) {
    console.error('저장 실패:', error);
    alert('저장 중 오류가 발생했습니다.');
  }
};
</script>

<style scoped>
.board-add { max-width: 500px; margin: 20px auto; display: flex; flex-direction: column; gap: 10px; }
.form-group input, .form-group textarea { width: 100%; padding: 10px; border: 1px solid #ccc; border-radius: 4px; }
button { padding: 10px; background-color: #42b983; color: white; border: none; border-radius: 4px; cursor: pointer; }
button:hover { background-color: #33a06f; }
</style>