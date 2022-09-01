package ru.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringApplicationClass {

//    private final SmthClass smthClass;

    public static void main(String[] args) {
        System.out.println("SpringApplicationClass main"); // 1
        SpringApplication.run(SpringApplicationClass.class, args);
    }
}
