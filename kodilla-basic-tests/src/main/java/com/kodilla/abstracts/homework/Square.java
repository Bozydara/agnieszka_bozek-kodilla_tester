package com.kodilla.abstracts.homework;

public class Square extends Shape {

    @Override
    public double calculateArea(double base, double side) {
        return base * side;
    }

    @Override
    public double calculatePerimeter(double base, double side) {
        return 2 * base + 2 * side;
    }
}