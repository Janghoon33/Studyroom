package com.test.Board.service;

import com.test.Board.entity.Board;
import com.test.Board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // service라고 지정
public class BoardService {

    @Autowired // 객체를 해당 변수에 집어 넣어줌
    private BoardRepository boardRepository;

    // 게시글 작성
    public void write(Board board) {

        boardRepository.save(board);

    }

    // 게시글 리스트 처리
    public List<Board> boardList(){

        return boardRepository.findAll();
    }

    // 게시글 내용 불러오기
    public Board boardContent(Integer id){

        return boardRepository.findById(id).get();
    }

    // 게시글 삭제
    public void boardDelete(Integer id){

        boardRepository.deleteById(id);

    }

}
