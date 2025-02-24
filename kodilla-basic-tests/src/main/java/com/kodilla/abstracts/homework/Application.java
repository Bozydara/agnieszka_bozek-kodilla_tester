package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Rhombus rhombus = new Rhombus();
        rhombus.calculateArea(4, 7);
        rhombus.calculatePerimeter(1.5, 2.5);

        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea(3, 6);
        rectangle.calculatePerimeter(7, 8);

        Square square = new Square();
        square.calculateArea(6, 6);
        square.calculatePerimeter(7, 7);
    }
}