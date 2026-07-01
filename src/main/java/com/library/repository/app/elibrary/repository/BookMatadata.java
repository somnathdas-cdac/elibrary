package com.library.repository.app.elibrary.repository;
/*
public interface BookMatadata {

}
*/
import com.library.repository.app.elibrary.model.Book;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookMatadata extends JpaRepository<Book, Long> {
    // Finds books where title starts with the given string (ignoring case)
    List<Book> findByTitleStartingWithIgnoreCase(String letter);
    List<Book> findBookById(Long id); 
    List <Book> findByTitleContainingIgnoreCase(String title);
    List <Book> findByAuthorContainingIgnoreCase(String author);
    
}
