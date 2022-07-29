package com.board.test.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.board.test.domain.Board;
import com.board.test.domain.Comment;
import com.board.test.domain.Member;
import com.board.test.domain.Senior;
import com.board.test.mapper.BoardMapper;
import com.board.test.mapper.CommentMapper;
import com.board.test.mapper.MemberMapper;
import com.board.test.mapper.SeniorMapper;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	BoardMapper mapper;
	
	@Autowired
	CommentMapper cmapper;
	
	@Autowired
	MemberMapper mmapper;
	
	@Autowired
	SeniorMapper smapper;
	
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
	
	public int insertMember(Member mem) {
        return mmapper.insertMember(mem);
    }
   
   public Member selectOneMember(Member mem) {
      return mmapper.selectOneMember(mem);
   }
   
   public Member selectAllMember(Member mem) {
      return mmapper.selectAllMember(mem);
   }
   
   public int seniorInsert(Senior senior) {
	   return smapper.seniorInsert(senior);
   }
}
