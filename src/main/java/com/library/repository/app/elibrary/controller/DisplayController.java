package com.library.repository.app.elibrary.controller;



//import java.awt.PageAttributes.MediaType;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.MediaType;

import lombok.extern.slf4j.Slf4j;//lombok---logger
import org.slf4j.Logger;//manual logger
import org.slf4j.LoggerFactory;//Manual Logger


import com.library.repository.app.elibrary.model.DisplayModel;
import com.library.repository.app.elibrary.services.DisplayService;



/*
public class DisplayController {

}

*/
@Controller
@Slf4j // <-- Automatically creates a 'log' variable for you
public class DisplayController {

    @Autowired
    private DisplayService displayService;
    
    
 // 1. Declare the logger inside the class body
    private static final Logger manualLog = LoggerFactory.getLogger(DisplayController.class);
    
    
   // @GetMapping({"/", "/index"})
    public String TempMethod(Model model)
    {
    	model.addAttribute("book", 8); 
    	// log.info("This is a clean Spring Boot test log message!");
    	 manualLog.info("Manual logger test message triggered!");
    	// INFO: For important application milestones
        
    	return "index";
    }
    
    
    
    @GetMapping("/view-pdf/{id}")
    
    public ResponseEntity<InputStreamResource> viewPdf(@PathVariable Long id) throws IOException {
        // 1. Extract book details from database
        DisplayModel displayModel = displayService.getBookById(id);
        File file = new File(displayModel.getFilePath());

        // 2. Prepare the file resource
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

        // 3. Set headers for displaying in browser tab
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=" + displayModel.getBookName() + ".pdf");
        
        System.out.print("Code is running and pdf is displaying.........");
     // Prints clean, formatted statements to your IDE console
      //  log.info("This is a clean Spring Boot test log message!");
        manualLog.info("Manual logger test message triggered!");
        
        return ResponseEntity.ok()
                .headers(headers)
               // .contentType(MediaType.APPLICATION_PDF)
                .contentType(MediaType.parseMediaType("application/pdf"))
                .contentLength(file.length())
                .body(resource);
                
                
       
    }
}
