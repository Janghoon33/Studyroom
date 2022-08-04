package com.smhrd.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.domain.Board;
import com.smhrd.mapper.BoardMapper;

@RestController // Ajax요청을 전담해서 처리할 컨트롤러
public class BoardRestController {
	// RestController에서는 @ResponseBody안붙여도된다
	
	// DI(Dependency Injection), 의존성 주입
	@Autowired // 메모리에 있는 객체를 끌어다가 집어넣어라
	BoardMapper mapper;
	
	// ajax 요청을 받아서 글 데이터 응답
		@RequestMapping("/boardList.do")
		public @ResponseBody List<Board> boardList() {
			// @ResponseBody
			// 이 데이터를 응답 --> 페이지 이동X
			// 리턴해주는 데이터를 그대로 응답
			
			// 글 데이터 가져오기
			List<Board> list = mapper.boardList();
			
			
			// jackson databind 라이브러리
			// 객체를 리턴 --> json 데이터 변환
			
			return list;
			
		}
		// ajax요청을 받는 Controller
		@RequestMapping("/viewUpdate.do")
		public @ResponseBody int viewUpdate(Board vo) {
			
			// 조회수 수정
			int cnt = mapper.viewUpdate(vo);
			
			
			// 성공 or 실패 리턴
			
			
			return cnt;
		}
		
	
	
	
	
	
	
}
