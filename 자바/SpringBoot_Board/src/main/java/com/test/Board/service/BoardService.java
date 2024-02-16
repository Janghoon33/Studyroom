package com.test.Board.service;

import com.test.Board.entity.Board;
import com.test.Board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // service라고 지정
public class BoardService {

    @Autowired // 객체를 해당 변수에 집어 넣어줌
    private BoardRepository boardRepository;

    public void write(Board board) {

        boardRepository.save(board);

    }
}
