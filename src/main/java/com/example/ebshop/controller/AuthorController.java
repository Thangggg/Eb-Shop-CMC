package com.example.ebshop.controller;

import com.example.ebshop.dto.AuthorDetail;
import com.example.ebshop.entity.Author;
import com.example.ebshop.entity.Book;
import com.example.ebshop.service.IAuthorService;
import com.example.ebshop.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    IAuthorService authorService;

    @GetMapping
    public ResponseEntity<List<Author>> findAllAuthor(){
        return new ResponseEntity<>(authorService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Author> save(@RequestBody Author author){
        return new ResponseEntity<>(authorService.save(author),HttpStatus.OK);
    }

    @PutMapping
    public Author edit(@RequestBody Author author){
        authorService.save(author);
        return author;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        authorService.delete(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuthorDetail> findAuthorById(@PathVariable String id){
        return new ResponseEntity<>(authorService.findAuthorDetail(id),HttpStatus.OK);
    }
}
