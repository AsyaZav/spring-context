package ru.main;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class SmthClass {

    private static String CONSTANT = "SMTH_CONSTANT";

    private String smthField;

    // init
    {
        System.out.println("Init block " + CONSTANT); //3
    }

    // static
    static {
        System.out.println("Static block " + CONSTANT); //2
    }

    SmthClass() {
        this.smthField = "";
        System.out.println("Constructor"); //4
    }

    @PostConstruct
    void postConstruct() {
        System.out.println("PostConstruct"); //5
    }
}
