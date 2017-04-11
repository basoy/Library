package com.bash.serg.service;

import com.bash.serg.dto.BookDto;

import java.util.List;

/**
 * Created by serg on 29.03.17.
 */
public interface BookService {

    List<BookDto> findAll();

    BookDto create(BookDto dto);
}
