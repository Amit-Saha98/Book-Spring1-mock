package com.example.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public void addBook(Books books){
        bookRepository.addBook(books);
    }

    public List<Books> getAllBooks(){
        return bookRepository.getAllBooks();
    }

    public void deleteBook(String s){
        bookRepository.deleteBook(s);
    }
}
