package com.board.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.mybatis.spring.annotation.MapperScan;

import com.board.test.domain.Comment;

@MapperScan
public interface CommentMapper {
	
	public List<Comment> CommentList();
	
	
	public int insertComment(Comment comment);
	
	
	public int CommentDelete(int c_num);
	
	
	
}