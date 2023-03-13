package com.board.single.controller.sohee;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class BookForm {

    @NotEmpty(message = "제목은 필수 입력입니다.")
    private String name;

    @NotEmpty(message = "저자는 필수 입력입니다")
    private String writer;

    @NotEmpty(message = "내용은 필수 입력입니다")
    private String content;
}
