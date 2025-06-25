package com.example.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{


    public void getBook() {
        System.out.println("We take a book from the school library");
    }
}
