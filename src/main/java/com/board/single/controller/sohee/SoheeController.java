package com.board.single.controller.sohee;

import com.board.single.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sohee")
public class SoheeController {

    @GetMapping("/list")
    public String list(){
        return "/view/sohee/list";
    }

    @GetMapping("/write")
    public String write(Model model){
        model.addAttribute("book", new Book());
        return "/view/sohee/write";
    }
}
