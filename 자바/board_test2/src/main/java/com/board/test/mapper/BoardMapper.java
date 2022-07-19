package com.board.test.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.board.test.domain.Board;

@MapperScan
public interface BoardMapper {
	
	public List<Board> boardList();
	
	public int boardInsert(Board vo);
	
	
	
}
