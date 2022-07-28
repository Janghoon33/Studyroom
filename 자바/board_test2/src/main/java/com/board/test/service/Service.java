package com.board.test.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.board.test.domain.Board;
import com.board.test.domain.Comment;
import com.board.test.mapper.BoardMapper;
import com.board.test.mapper.CommentMapper;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	BoardMapper mapper;
	
	@Autowired
	CommentMapper cmapper;
	
	public int insertBoard(Board board) {
		return mapper.insertBoard(board);
	}
	
	public Board  boardContent(int b_num) {
		return mapper.boardContent(b_num);
	}
	
	public int boardDelete(int b_num) {
		return mapper.boardDelete(b_num);
	}
	
	public int insertComment(Comment comment) {
		return cmapper.insertComment(comment);
	}
	
	public int deleteComment(int c_num) {
		return cmapper.deleteComment(c_num);
	}
}
