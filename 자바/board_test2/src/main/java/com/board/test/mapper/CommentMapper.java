package com.board.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.mybatis.spring.annotation.MapperScan;

import com.board.test.domain.Comment;

@MapperScan
public interface CommentMapper {
	
	public List<Comment> CommentList(int num);
	
	
	public int insertComment(Comment comment);
	
//	@Delete("delete *  from tbl_comment where c_num = #{c_num}")
	public int deleteComment(int c_num);
	
	
	
}