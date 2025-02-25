package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    Calculator calculator = new Calculator();

    @Test
    public void testSumNumbers() {
        int a = 5;
        int b = 8;
        int sumResult = calculator.sumNumbers(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtractNumbers() {
        double a = 5.6;
        double b = 8.2;
        double delta = 1e-2;
        double subtractResult = calculator.subtractNumbers(a, b);
        assertEquals(-2.6, subtractResult, delta);
    }

    @Test
    public void testSquareNumber() {
        double a1 = -21;
        double a2 = 0;
        double a3 = 5.47;
        double delta = 1e-2;
        double squareResult = calculator.squareNumber(a1);
        assertEquals(441, squareResult, delta);

        squareResult = calculator.squareNumber(a2);
        assertEquals(0, squareResult, delta);

        squareResult = calculator.squareNumber(a3);
        assertEquals(29.92, squareResult, delta);
    }
}