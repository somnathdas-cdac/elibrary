package com.library.repository.app.elibrary.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.repository.app.elibrary.model.DisplayModel;
import com.library.repository.app.elibrary.repository.BookRepository;

/*
public class DisplayService {

}
*/

@Service
public class DisplayService {
    @Autowired
    private BookRepository bookRepository;

    public DisplayModel getBookById(Long id) {
        return bookRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Book not found"));
    }
}
