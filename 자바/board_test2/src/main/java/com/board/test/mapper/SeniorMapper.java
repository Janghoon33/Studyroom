package com.board.test.mapper;

import java.util.List;



import org.mybatis.spring.annotation.MapperScan;

import com.board.test.domain.Senior;

@MapperScan
public interface SeniorMapper {
   
   public List<Senior> seniorList();
   
   public int seniorInsert(Senior senior);
   
}