package com.board.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.board.test.domain.Board;
import com.board.test.mapper.BoardMapper;
import com.board.test.service.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class RController {
	
	private final Service service;
	
	@Autowired
	BoardMapper mapper;

	
	@PostMapping("/api/board")
	public List<Board> board() {
		System.out.println("게시글 목록 페이지");
	//		Board board = new Board(1, "jj","gg","hh","2022.07.23");
		List<Board> board = mapper.boardList();
		return  board;
	}
	
	@PostMapping("/api/boardInsert")
	public int boardInsert(@RequestBody Board board) {
		System.out.println("게시글 작성완료");
		return service.insertBoard(board);
	}
	
	@PostMapping("/api/boardContent/{b_num}")
	public Board boardContent(@RequestBody int b_num) {
		System.out.println("상세 글 보기"+b_num);
		return service.boardContent(b_num);
	}
}
