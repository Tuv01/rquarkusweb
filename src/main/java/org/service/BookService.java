package org.service;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.Valid;

import org.data.Book;

@ApplicationScoped
public class BookService {
    
    public Book checkBook(@Valid Book book){
        return book;
    }
}