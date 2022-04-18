package com.example.ebshop.dto;

import com.example.ebshop.entity.Book;
import lombok.Data;

import java.util.List;

@Data
public class AuthorDetail {
    private String id;
    private String nameAuthor;
    private List<String> nameBook;
    private long quantity_sold;


    public AuthorDetail(String id, String nameAuthor, List<String> nameBook, long quantity_sold) {
        this.id = id;
        this.nameAuthor = nameAuthor;
        this.nameBook = nameBook;
        this.quantity_sold = quantity_sold;
    }

    public AuthorDetail() {
    }
}
