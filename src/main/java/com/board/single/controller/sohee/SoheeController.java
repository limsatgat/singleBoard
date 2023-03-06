package com.board.single.controller.sohee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sohee")
public class SoheeController {

    @GetMapping("/test")
    public String test(){
        return "/view/sohee/test";
    }
}
