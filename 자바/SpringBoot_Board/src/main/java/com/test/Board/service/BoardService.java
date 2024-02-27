package com.test.Board.service;

import com.test.Board.entity.Board;
import com.test.Board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.UUID;

@Service // service라고 지정
public class BoardService {

    @Autowired // 객체를 해당 변수에 집어 넣어줌
    private BoardRepository boardRepository;

    // 게시글 작성
    public void write(Board board, MultipartFile file) throws Exception {
        
        String projectPath = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\files"; // 파일을 저장할 경로를 지정

        UUID uuid = UUID.randomUUID(); // 파일 이름에 붙일 랜덤이름 생성
        String fileName = uuid+"_"+file.getOriginalFilename(); // 원래 파일 이름과 붙여 저장될 파일 이름 생성

        File saveFile = new File(projectPath,fileName); // 파일 인스턴스를 생성
        file.transferTo(saveFile);

        board.setFilename(fileName); // DB에 파일 이름 저장
        board.setFilepath("/files/"+fileName); // DB에 파일 경로 저장

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
