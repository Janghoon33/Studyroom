package com.smhrd.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smhrd.domain.Board;
import com.smhrd.mapper.BoardMapper;

@Controller //어노테이션
// 이 파일이 알바생(POJO)이다
public class BoardController {
	
	// DI(Dependency Injection)
	@Autowired // 메모리에 있는 객체를 끌어다가 집어넣어라
	BoardMapper mapper;
	
	//메서드로 업무를 줌
	@RequestMapping("/boardList.do") //메서드와 요청 url을 매핑
	public String boardList(Model model) {
		// 매개변수로 필요한 request 등 객체를 받아올 수 있다.
		// Model => 객체 바인딩용 객체
		
		// 게시판 데이터를 가져오기
		// 글 번호, 제목, 작성자, 내용, 작성일, 조회수 --> VO
		List<Board> list = mapper.boardList();
		
		// 객체바인딩 ( request영역에 list 저장)
		// request.setAttribute( "list", list );
		model.addAttribute("list", list);
		// boardList.jsp로 이동
		// forward
		// "/WEB-INF/views/boardList.jsp"
		return "boardList"; // 리턴값 == View의 논리적인 이름
		
	}
	// 405오류뜨면 -> 여기고쳐
	// boardForm.jsp로 이동만 하는 메소드
	// @RequestMapping -> Get/Post 둘다 받음
	// Get, Post 두 방식을 이용해, 같은 요청이라도 다른 기능을 하게 만들 수 있다
	// a태그 or location.href 이동 == GET방식
	@GetMapping("/boardInsert.do")
	public String boardForm() {
		return "boardForm";
	}
	
	
	@PostMapping("/boardInsert.do")
	public String boardInsert(Board vo) {
		// Vo필드명 == input태그의 name
		// 기본 생성자 필수
		
		// 게시글 저장
		mapper.boardInsert(vo);
		
		
		// 목록 페이지 이동
		// 다시 POJO를 호출해야되는 경우 Redirect 사용
		return "redirect:/boardList.do";
				
		
	}
	// 게시글 상세보기 페이지로 가는 컨트롤러
	// http://localhost:8083/web/boardContent.do/5
	@RequestMapping("boardContent.do/{idx}") // Path Variable의 키값 선언
	public String boardContent(Model model, @PathVariable int idx) {
		// 1. 쿼리스트링을 이용한 데이터 전송
		// 만약 1개만 받을거라면, 매개변수의 변수명 == name값 이면, 파라미터 수집할 수 있다.
		// int idx = Integer.parseInt(request.getParameter("idx"));
		// @RequestParam("idx") int num
		// name이 idx인 파라미터의 값을 int num 안에 담아달라
		// boardContent.do/{idx} : {}위치에 오는 값에 idx라는 key값을 부여 
		// @PathVariable int idx : Path Variable값을 idx에 담기
		// @PathVariable("idx") int num : 변수명과 key값이 다른경우 
		// @PathVariable 변수명과 ()가 같다면 ()생략가능
		
		// view 이름을 리턴 X --> 페이지 이동
		// WEB-INF/views/boardContent.jsp
		// ( 메서드 이름 == view의 논리적인 이름 ) 이라면, void를 사용해도 페이지가 이동된다.
		
		// 특정한 하나의 글 데이터를 가져오기
		Board vo = mapper.boardContent(idx);
		
		System.out.println(vo.getTitle());
		
		// 객체바인딩 
		model.addAttribute("board", vo);
		
		return "boardContent"; // Path Variable을 사용할때는 , 반드시 직접  view를 알려줄것
	}
	
	// 게시글 삭제할 메소드
	// boardList.do?idx=4&title=스프링&writer=병갑
	@RequestMapping("boardDelete.do")
	public String boardDelete( int idx ) {
		
		// 특정한 하나의 게시글 삭제
		mapper.boardDelete(idx);
		
		// 목록페이지 이동
		return "redirect:/boardList.do";
		
	}
	// Update페이지로 이동하는 Controller
	// boardGoUpdate.do?idx=4
	@RequestMapping("/boardGoUpdate.do")
	public String boardGoUpdate( int idx , Model model ) {
		
		// 특정 하나의 게시글 정보를 가져오기
		Board vo = mapper.boardContent(idx);
		
		// 저장 ( 객체바인딩 )
		model.addAttribute( "board" , vo );
		
		// boardUpdate.jsp로 이동
		// /WEB-INF/views/boardUpdate.jsp
		return "boardUpdate";
	}
	
	// Update 시켜주는 메소드
	// form태그로 접근 ( title, idx, content )
	@RequestMapping("/boardUpdate.do")
	public String boardUpdate(Board vo) {
		
		// 사용자가 입력한 데이터로, update
		mapper.boardUpdate(vo);
		// (목록? 상세보기?)페이지 이동
		
		return "redirect:/boardList.do";
		
		// 상세보기 return "boardContent.do/" + vo.getIdx();
	}
	
	
	
	
	
	
}
