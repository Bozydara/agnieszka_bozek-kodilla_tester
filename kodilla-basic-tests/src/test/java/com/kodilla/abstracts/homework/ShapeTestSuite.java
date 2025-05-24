package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeTestSuite {
    Rhombus rhombus = new Rhombus();
    Rectangle rectangle = new Rectangle();
    Square square = new Square();

    @Test
    void shouldCalculateArea() {
        //Given
        double a = 12.1;
        double b = 3.7;
        //When
        double rhombusArea = rhombus.calculateArea(a, b);
        double rectangleArea = rectangle.calculateArea(a, b);
        double squareArea = square.calculateArea(a, b);
        //Then
        assertEquals(44.77, rhombusArea);
        assertEquals(44.77, rectangleArea);
        assertEquals(44.77, squareArea);
    }

    @Test
    void shouldCalculatePerimeter() {
        //Given
        double a = 4;
        double b = 5;
        //When
        double rectanglePerimeter = rectangle.calculatePerimeter(a, b);
        double rhombusPerimeter = rhombus.calculatePerimeter(a, b);
        double squarePerimeter = square.calculatePerimeter(a, b);
        //Then
        assertEquals(18, rectanglePerimeter);
        assertEquals(18, rhombusPerimeter);
        assertEquals(18, squarePerimeter);
    }
}