package com.example.spring.aop;

import org.springframework.stereotype.Component;

@Component("uniLibrary")
public class UniversityLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("We take a book from the uni library\n");
    }

    public String returnBook() {
        System.out.println("We return the book to the uni library\n");
        return "War and Piece";
    }

    public void addBook(String personName, Book book) {
        System.out.println("We add the book to the uni library\n");
    }

    public void getMagazine() {
        System.out.println("We take a magazine from the uni library\n");
    }

    public void returnMagazine() {
        System.out.println("We return the magazine to the uni library\n");
    }

    public void addMagazine() {
        System.out.println("We add a magazine to the uni library\n");
    }
}
