package com.example.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/add-book")
    public ResponseEntity<String>addBook(@RequestBody Books books){
        bookService.addBook(books);
        return new ResponseEntity<>("Added", HttpStatus.CREATED);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Books>>getAllBooks(){
        return new ResponseEntity<>(bookService.getAllBooks(),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete")
    public void deleteBook(@RequestParam String s){
        bookService.deleteBook(s);
    }
}
