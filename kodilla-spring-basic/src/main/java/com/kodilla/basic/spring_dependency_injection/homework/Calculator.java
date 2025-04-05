package com.kodilla.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display displayValue;
    private double result;

    public Calculator(Display display) {
        this.displayValue = display;
    }

    public double add(double a, double b) {
        result = a + b;
        displayValue.display(result);
        return result;
    }

    public double subtract(double a, double b) {
        result = a - b;
        displayValue.display(result);
        return result;
    }

    public double multiply(double a, double b) {
        result = a * b;
        displayValue.display(result);
        return result;
    }

    public double divide(double a, double b) {
        result = a / b;
        displayValue.display(result);
        return result;
    }
}