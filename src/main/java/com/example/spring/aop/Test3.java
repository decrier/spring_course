package com.example.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Starting Main...");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary uniLibrary = context.getBean("uniLibrary", UniversityLibrary.class);
        String bookName = uniLibrary.returnBook();
        System.out.println(bookName + " was returned to the library");

        context.close();
        System.out.println("Ending Main...");
    }
}
