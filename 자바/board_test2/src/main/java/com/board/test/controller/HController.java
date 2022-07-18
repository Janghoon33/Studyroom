package com.board.test.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ComponentScan(basePackages = "com.board.test.controller")
@Controller
public class HController {
	@RequestMapping(value="/")
	public String index() {
		return "main";
	}
}
