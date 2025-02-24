package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public double calculateArea(double base, double side) {
        return base * side;
    }

    public double calculatePerimeter(double base, double side) {
        return 2 * (base + side);
    }
}