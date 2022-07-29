package com.board.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.mybatis.spring.annotation.MapperScan;

import com.board.test.domain.Board;

@MapperScan
public interface BoardMapper {
	
	public List<Board> boardList();
	
	
	public int insertBoard(Board board);
	
	public Board boardContent(int b_num);
	
	@Delete("delete from tbl_board where b_num = #{b_num}")
	public int boardDelete(int b_num);
	
	public int boardUpdate(Board vo);
	
}
