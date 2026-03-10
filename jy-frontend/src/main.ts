import './assets/main.css'

import { createApp } from 'vue'
import App from './App.vue'
import router from './router' // 1. 라우터 불러오기

const app = createApp(App)

app.use(router) // 2. 여기서 에러나면 화면 전체가 하얗게 변합니다.
app.mount('#app')
