package com.jh.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/test")
    public String Test(Model model){
        model.addAttribute("username","janghoon");
        return "greetings"; // templates/greetings.mustache -> 브라우저로 전송
    }
}
