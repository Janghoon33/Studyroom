package com.test.Board.controller;

import com.test.Board.entity.Board;
import com.test.Board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write") // -> localhost:8080/board/write
    public String boardWriteForm(){

        return "boardwrite"; // return 해줄 view 파일
    }

    @PostMapping("/board/writedo")
    public String boardWriteDo(Board board, Model model, @RequestParam(name="file") MultipartFile file) throws Exception{ // Entity를 그대로 매개변수로 받기

        boardService.write(board,file);

        model.addAttribute("message","글 작성이 완료되었습니다.");

        model.addAttribute("Url","/board/list");

        return "message";
    }

    @GetMapping("/board/list")
    public String boardList(Model model, @PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.DESC) Pageable pageable){
        // page : default 페이지 , size : 한 페이지 게시글 수 , sort : 정렬 기준 컬럼, direction : 정렬 순서

        Page<Board> list = boardService.boardList(pageable);

        int nowPage = list.getPageable().getPageNumber() + 1; // pageable은 0부터 시작하므로 1더해주기
        int startPage = Math.max(nowPage - 4, 1); // nowpage가 1보다 작을땐 마이너스가 나오므로 1보다 작을땐 1이 나오도록
        int endPage = Math.min(nowPage + 5, list.getTotalPages()); // +5를 했을때 totalpage수를 넘길경우엔 totalpage수가 나올수 있도록해주기

        model.addAttribute("list",list);
        model.addAttribute("nowPage",nowPage);
        model.addAttribute("startPage",startPage);
        model.addAttribute("endPage",endPage);

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
    public String boardUpdate(@PathVariable("id") Integer id, Board board, @RequestParam(name="file") MultipartFile file) throws Exception{

        Board boardTemp = boardService.boardContent(id); // 기존의 내용을 담은 boardTemp 객체에 수정할 내용을 덮어 쓰기
        boardTemp.setTitle(board.getTitle());
        boardTemp.setContent(board.getContent());

        boardService.write(boardTemp, file); // boardTemp의 내용으로 저장

        return "redirect:/board/content?id={id}";
    }

}
