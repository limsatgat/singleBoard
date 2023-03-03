package com.board.single.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WebController{

    // 메인
    @GetMapping("/")
    public String index(){
        return "index";
    }

    // 게시판
    @GetMapping("/board")
    public String board(){
        return "/view/board";
    }
}
