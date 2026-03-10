package com.example.demo.entity; // 사용자님의 실제 패키지 경로로 수정하세요!

import jakarta.persistence.*; // Spring Boot 3버전 기준
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter // 데이터를 넣고 빼기 위해 Getter, Setter가 필요합니다.
public class Board {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)private Long id;
    private String title;
    private String content;
    private String writer;

    // 직접 작성 (에러 방지용)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public String getWriter() { return writer; }
    public void setWriter(String writer) { this.writer = writer; }
}