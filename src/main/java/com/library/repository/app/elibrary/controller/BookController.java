package com.library.repository.app.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import com.library.repository.app.elibrary.repository.BookMatadata;
//=======================================================================

import com.library.repository.app.elibrary.model.Book;
import com.library.repository.app.elibrary.repository.BookMatadata;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class BookController {

    private final BookMatadata bookMatadata;

    public BookController(BookMatadata bookMatadata) {
        this.bookMatadata = bookMatadata;
    }
    @GetMapping({"/","/index"})
    public String indexMethod(Model model)
    
    {
    	 // Generate A-Z list utility for the view template
        List<String> alphabet = Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
    	model.addAttribute("alphabet", alphabet);
        return "index";
    }

    
    
    
    
    @GetMapping("/books")
    public String getBooksByLetter(@RequestParam(name = "letter", required = false) String letter, Model model) {
        List<Book> books;
        
        if (letter != null && !letter.isEmpty()) {
            books = bookMatadata.findByTitleStartingWithIgnoreCase(letter);
            model.addAttribute("selectedLetter", letter.toUpperCase());
        } else {
            books = bookMatadata.findAll();
        }

        // Generate A-Z list utility for the view template
       // List<String> alphabet = Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
        
        model.addAttribute("books", books);
       // model.addAttribute("alphabet", alphabet);
        return "books";
    }
    
    
    
    
    @GetMapping("/books/details/{id}")
    public String getMetaDataById(@PathVariable( "id") Long Id, Model model )
    
    {
    	List<Book> metaDetail;
    	// 1. Extract future data from database using the passed ID
        // Book book = bookService.findById(id);
    	metaDetail=bookMatadata.findBookById(Id);
    	//model.addAttribute("detailMatadata", metaDetail);
    	
    	if (!metaDetail.isEmpty())
    	{
    	  Book	metaDetailOneRow=metaDetail.get(0);
    	  model.addAttribute("detailMatadata", metaDetailOneRow);
    	}
    	
    	else {
    		 model.addAttribute("detailMatadata", null);
    	}
    	
    	
    	
    	
    	
    	return "meta-data";
    }
    
    
}

