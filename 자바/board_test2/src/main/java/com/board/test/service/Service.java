package com.board.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.board.test.domain.Board;
import com.board.test.mapper.BoardMapper;
import com.board.test.repo.Repo;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	Repo repo;
	
	@Autowired
	BoardMapper mapper;
	
	public List<Board> findAll(){
		return repo.findAll();
	}
	
	
	public List<Board> boardList(Board board){
		return boardList(board);
	}

	public int writeAction(String b_title, String b_content) {
	return mapper.writeAction(b_title, b_content);
	}	
	
//	public void writeAction(String b_title, String b_content) {
//		mapper.writeAction(b_title, b_content);
//	}
}
