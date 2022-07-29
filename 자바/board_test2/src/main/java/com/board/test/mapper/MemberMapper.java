package com.board.test.mapper;

import org.mybatis.spring.annotation.MapperScan;

import com.board.test.domain.Member;


@MapperScan
public interface MemberMapper {
   
   public int insertMember(Member mem);

   public Member selectOneMember(Member mem);
   
   public Member selectAllMember(Member mem);

}