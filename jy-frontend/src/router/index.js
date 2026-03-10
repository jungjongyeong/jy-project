import { createRouter, createWebHistory } from 'vue-router' // 'vue-router' 설치 여부 확인
import BoardAdd from '../components/BoardAdd.vue'

const routes = [
  { path: '/add', name: 'BoardAdd', component: BoardAdd }
]

const router = createRouter({
  history: createWebHistory(), // ? 여기 괄호 ()가 없으면 화면이 안 뜹니다!
  routes
})

export default router