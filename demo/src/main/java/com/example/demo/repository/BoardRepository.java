package com.example.demo.repository;

import com.example.demo.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    // 이 인터페이스 하나만으로 저장(save), 조회(findAll)가 다 가능해집니다!
}