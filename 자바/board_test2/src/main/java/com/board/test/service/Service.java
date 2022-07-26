package com.board.test.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.board.test.domain.Board;
import com.board.test.mapper.BoardMapper;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	BoardMapper mapper;
	
	
	public int insertBoard(Board board) {
		return mapper.insertBoard(board);
	}
	
	public Board  boardContent(int b_num) {
		return mapper.boardContent(b_num);
	}
	
}
