package com.board.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.test.domain.Board;
import com.board.test.mapper.BoardMapper;

@ComponentScan(basePackages = "com.board.test.controller")
@Controller
public class HController {
	
	@Autowired
	BoardMapper mapper;
	
	@RequestMapping(value="/boardList")
	public String index(Model model) {
		List<Board> list = mapper.boardList();
		model.addAttribute("list",list);
		return "boardList";
	}
	
	@GetMapping("/boardInsert.do")
	public String boardForm() {
		return "boardForm";
	}
	
	
	@PostMapping("/boardInsert.do")
	public String boardInsert(Board vo) {
		
		mapper.boardInsert(vo);
		
		return "redirect:/boardList.do";
	}
}
