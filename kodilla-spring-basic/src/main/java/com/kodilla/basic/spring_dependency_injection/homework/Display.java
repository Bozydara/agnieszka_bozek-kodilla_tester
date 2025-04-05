package com.kodilla.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public void display(double value) {
        System.out.println("The result is: " + value);
    }
}