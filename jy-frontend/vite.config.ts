import { fileURLToPath, URL } from 'node:url'

import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import vueDevTools from 'vite-plugin-vue-devtools'

// https://vite.dev/config/
export default defineConfig({
  plugins: [
    vue(),
    vueDevTools(),
  ],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url))
    },
  },
  build: {
    // 빌드 결과물이 바로 스프링 부트의 static 폴더로 가도록 경로 설정
    outDir: '../demo/build/resources/main/static', 
    emptyOutDir: true // 빌드할 때마다 기존 static 폴더를 깨끗이 비움
  }
})
