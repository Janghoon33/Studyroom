package com.board.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import com.board.test.domain.Board;
import com.board.test.mapper.BoardMapper;
import com.board.test.service.Service;

@ComponentScan(basePackages = "com.board.test.controller")
@Controller
public class HController {
	
	@Autowired
	BoardMapper mapper;
	
	@Autowired
	Service service;
	
	Board board;
	
	
	
	
	
}
