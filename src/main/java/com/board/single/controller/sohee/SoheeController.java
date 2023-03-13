package com.board.single.controller.sohee;

import com.board.single.domain.Book;
import com.board.single.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/sohee")
@RequiredArgsConstructor
public class SoheeController {

    private final BookService bookService;

    @GetMapping("/list")
    public String list() {
        // TODO read 추가

        return "view/sohee/list";
    }

    @GetMapping("/write")
    public String write(Model model) {
        model.addAttribute("bookForm", new BookForm());
        return "view/sohee/write";
    }

    @PostMapping("/save")
    public String save(@Valid BookForm form, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "view/sohee/write";
        }

        Book book = new Book();
        book.setName(form.getName());
        book.setContent(form.getContent());
        book.setWriter(form.getWriter());
        book.setCreateDatetime(LocalDateTime.now()); // TODO 시간 포멧 설정 필요

        bookService.save(book);

        return "redirect:/sohee/list";
    }
}
