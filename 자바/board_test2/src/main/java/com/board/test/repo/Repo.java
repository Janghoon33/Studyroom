package com.board.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.board.test.domain.Board;

@Repository
public interface Repo extends JpaRepository<Board, String> {
	
}
