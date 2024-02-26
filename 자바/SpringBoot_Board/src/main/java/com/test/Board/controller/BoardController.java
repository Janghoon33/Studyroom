package com.test.Board.controller;

import com.test.Board.entity.Board;
import com.test.Board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write") // -> localhost:8080/board/write
    public String boardWriteForm(){

        return "boardwrite"; // return 해줄 view 파일
    }

    @PostMapping("board/writedo")
    public String boardWriteDo(Board board){ // Entity를 그대로 매개변수로 받기

        boardService.write(board);

        return "";
    }

    @GetMapping("/board/list")
    public String boardList(Model model){

        model.addAttribute("list",boardService.boardList()); // boardService에서 boardList를 받아서 "list"라는 이름으로 넘기겠다

        return "boardList";
    }

    @GetMapping("/board/content") // localhost:8080/board/content?id=1 로 확인가능
    public String boardContent(Model model, @RequestParam(name="id") Integer id){

        model.addAttribute("board",boardService.boardContent(id));
        return "boardcontent";
    }

    @GetMapping("/board/delete")
    public String boardDelete(@RequestParam(name="id") Integer id){

        boardService.boardDelete(id);

        return "redirect:/board/list"; // 삭제후 게시글 목록 페이지로 리다이렉트
    }

    @GetMapping("/board/modify/{id}")
    public String boardModify(@PathVariable("id") Integer id, Model model){

        model.addAttribute("board",boardService.boardContent(id));

        return "boardmodify";
    }

    @PostMapping("/board/update/{id}")
    public String boardUpdate(@PathVariable("id") Integer id, Board board){

        Board boardTemp = boardService.boardContent(id); // 기존의 내용을 담은 boardTemp 객체에 수정할 내용을 덮어 쓰기
        boardTemp.setTitle(board.getTitle());
        boardTemp.setContent(board.getContent());

        boardService.write(boardTemp); // boardTemp의 내용으로 저장

        return "redirect:/board/content?id={id}";
    }

}
