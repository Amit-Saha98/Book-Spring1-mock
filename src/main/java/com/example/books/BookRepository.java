package com.example.books;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class BookRepository {

    HashMap<String,Books>bookMap = new HashMap<>();

    public void addBook(Books books){
        bookMap.put(books.getName(),books);
    }

    public List<Books> getAllBooks(){
        List<Books> response = new ArrayList<>();
        for(String s : bookMap.keySet()){
            response.add(bookMap.get(s));
        }
        return response;
    }

    public void deleteBook( String s){
        bookMap.remove(s);
    }
}
