package com.bash.serg.service.impl;

import com.bash.serg.dao.BookDao;
import com.bash.serg.dto.BookDto;
import com.bash.serg.entity.BookEntity;
import com.bash.serg.service.BookService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serg on 29.03.17.
 */
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;

    @Override
    @Transactional
    public List<BookDto> findAll() {
        List<BookDto> books = new ArrayList<>();
        ModelMapper mapper = new ModelMapper();
        for (BookEntity bookEntity : bookDao.findAll()) {
            BookDto book = mapper.map(bookEntity, BookDto.class);
            books.add(book);
        }
        return books;
    }

    @Override
    @Transactional
    public BookDto create(BookDto dto){
        ModelMapper mapper = new ModelMapper();
        BookEntity entity = mapper.map(dto, BookEntity.class);
        entity = bookDao.save(entity);
        return mapper.map(entity,BookDto.class);
    }
}
