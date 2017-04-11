package com.bash.serg.controller;

import com.bash.serg.dto.BookDto;
import com.bash.serg.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by basoy on 10.04.17.
 */

@Controller
public class BookController {

    @Autowired
    private BookService service;

    @RequestMapping("/books")
    public ModelAndView findAll() {
        List<BookDto> all = service.findAll();
        ModelAndView mav= new ModelAndView();
        mav.addObject("name", all);
        mav.setViewName("books");
        return mav;
    }
}
