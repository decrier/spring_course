package com.example.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("myDog")
    private Pet pet;

    @Value("${person.surname}")
    private String Surname;

    @Value("${person.age}")
    private int age;

//    @Autowired
    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

//    public Person() {
//        System.out.println("Person bean is created");
//    }

//    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    //@Autowired
//    public void anyMethodName(Pet pet) {
//        System.out.println("Class Person: anyMethodName");
//        this.pet = pet;
//    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person set surname");
        Surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person set age");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello my lovely Pet!");
        pet. say();
    }
}
