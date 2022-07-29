package com.board.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.board.test.domain.Member;

@Repository
public interface MRepo extends JpaRepository<Member, String>{
   
   
}