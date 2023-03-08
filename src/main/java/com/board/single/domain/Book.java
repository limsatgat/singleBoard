package com.board.single.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Book {

    @Id
    @GeneratedValue
    @Column(name="book_id")
    private Long id;

    private String name;
    private String writer;
    private String content;

}
