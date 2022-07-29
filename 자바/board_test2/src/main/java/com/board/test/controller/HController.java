package com.board.test.controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.board.test.domain.Board;
import com.board.test.domain.Senior;
import com.board.test.mapper.BoardMapper;
import com.board.test.mapper.SeniorMapper;
import com.board.test.service.Service;

@ComponentScan(basePackages = "com.board.test.controller")
@Controller
public class HController {
	
	@Autowired
	BoardMapper mapper;
	@Autowired
	SeniorMapper smapper;
	
	@Autowired
	Service service;
	
	Board board;
	
	Senior senior;
	   @GetMapping("/SeniorInsertt.do")
	   public String SeniorForm() {
	      System.out.println("입력");
	      return "SeniorForm";
	   }
	@PostMapping("/seniorinsert.do")
	   public String seniorinsert (MultipartFile photo,HttpServletRequest request) throws Exception{
	      
	      Senior vo = new Senior();
	      
	      String S_name = request.getParameter("S_name");
	      System.out.println(S_name);
	      String S_birth = request.getParameter("S_birth");
	      System.out.println(S_birth);
	      String S_phone = request.getParameter("S_phone");
	      System.out.println(S_phone);
	      String S_gender = request.getParameter("S_gender");
	      System.out.println(S_gender);
	      String S_address = request.getParameter("S_address");
	      System.out.println(S_address);
	      String S_care = request.getParameter("S_care");
	      System.out.println(S_care);
	   
	      String S_photoPath = "C:\\Users\\smhrd\\Desktop\\리액트 코드\\SeeU-master\\프론트엔드\\xtreme-react-lite-master (2)\\src\\assets\\images\\Senior";
	      UUID uuid = UUID.randomUUID();
	      String S_photoname = uuid + "_" + photo.getOriginalFilename();
	      File saveFile = new File(S_photoPath,S_photoname);
	      photo.transferTo(saveFile);

	      vo.setS_name(S_name);
	      vo.setS_birth(S_birth);
	      vo.setS_phone(S_phone);
	      vo.setS_gender(S_gender);
	      vo.setS_address(S_address);
	      vo.setS_care(S_care);
	      vo.setS_photoname(S_photoname);
	      vo.setS_photopath(S_photoPath);
	      
	      
	      System.out.println(S_photoname);
	      System.out.println(S_photoPath);
	      
	      smapper.seniorinsert(vo);

	      return "redirect:/SeniorInsertt.do";

	   }
	
	
}
