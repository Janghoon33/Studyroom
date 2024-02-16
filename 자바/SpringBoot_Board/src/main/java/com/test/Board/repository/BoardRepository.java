package com.test.Board.repository;

import com.test.Board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // repository라고 지정
public interface BoardRepository extends JpaRepository<Board, Integer> { // JPA를 상속받아서 사용  < 사용할 엔티티 , 엔티티 내 pk의 타입 >

}
