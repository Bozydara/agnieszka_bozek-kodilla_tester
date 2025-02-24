package com.kodilla.abstracts.homework;

public class Rhombus extends Shape {
    @Override
    public double calculateArea(double base, double height) {
        return base * height;
    }

    @Override
    public double calculatePerimeter(double base, double side) {
        return 2 * (base + side);
    }
}