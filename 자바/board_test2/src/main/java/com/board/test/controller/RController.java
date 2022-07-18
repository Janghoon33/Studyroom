package com.board.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.board.test.domain.Board;
import com.board.test.service.Service;

@RestController
public class RController {
	@Autowired
	private Service service;
	
	@RequestMapping(value = "/board", method = {RequestMethod.GET})
	public List<Board> userDataFindAll() {
		List<Board> list = service.findAll();
		return list;
	}
	
	
	@RequestMapping(value = "/boardMB", method = {RequestMethod.GET})
	public List<Board> userDataFindAllMB(){
		List<Board> list = service.findAllMB();
		return list;
	}
	
	
	
	
}
