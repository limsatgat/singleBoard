package com.board.single.service;

import com.board.single.domain.Book;
import com.board.single.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public Long save(Book book) {
        bookRepository.save(book);
        return book.getId();
    }
}
