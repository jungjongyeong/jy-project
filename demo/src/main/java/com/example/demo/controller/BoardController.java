package com.example.demo.controller; // 사용자님의 실제 패키지 경로

import com.example.demo.entity.Board;
import com.example.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class BoardController {

    @Autowired 
    private BoardRepository boardRepository;

    // 데이터 저장: http://localhost:9090/api/add (POST 방식)
    @PostMapping("/add")
    public Board add(@RequestBody Board board) {
        return boardRepository.save(board);
    }

    // 전체 조회: http://localhost:9090/api/all (GET 방식)
    @GetMapping("/all")
    public List<Board> getAll() {
        return boardRepository.findAll();
    }
}