package com.board.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.board.test.domain.Board;
import com.board.test.domain.Comment;
import com.board.test.mapper.BoardMapper;
import com.board.test.mapper.CommentMapper;
import com.board.test.service.Service;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class RController {
	
	private final Service service;
	
	@Autowired
	BoardMapper mapper;

	@Autowired
	CommentMapper cmapper;
	
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
	
	@PostMapping("/api/boardContent")
	public Board boardContent(@RequestBody int b_num ) {
		
		System.out.println("상세 글 보기"+b_num);
		return service.boardContent(b_num);
	}
	
	@PostMapping("/api/boardDelete")
	public int boardDelete(@RequestBody int b_num) {
		System.out.println("글삭제");
		return service.boardDelete(b_num);
		
	}
	
	@PostMapping("/api/comment")
	public List<Comment> comment(){
		List<Comment> comment = cmapper.CommentList();
		System.out.println("댓글");
		return comment;
	}
	
	@PostMapping("/api/commentInsert")
	public int commentInsert(@RequestBody Comment comment) {
		System.out.println("댓글 작성!");
		return service.insertComment(comment);
	}
	
}
