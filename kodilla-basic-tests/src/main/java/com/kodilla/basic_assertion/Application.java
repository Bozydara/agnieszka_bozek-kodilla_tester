package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sumNumbers(a, b);
        int subtractResult = calculator.subtractNumbers(a, b);
        int squareResult = calculator.squareNumber(a);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        boolean correctSubtract = ResultChecker.assertEquals(-3, subtractResult);
        boolean correctSquare = ResultChecker.assertEquals(25, squareResult);

        if (correctSum) {
            System.out.println("Metoda sumNumbers działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sumNumbers nie działa poprawnie dla liczb " + a + " i " + b);
        }

        if (correctSubtract) {
            System.out.println("The function subtractNumbers works correctly for numbers " + a + " and " + b);
        } else {
            System.out.println("The function subtractNumbers does not work correctly for numbers " + a + " and " + b);
        }

        if (correctSquare) {
            System.out.println("The function squareNumber works correctly for number " + a + ".");
        } else {
            System.out.println("The function squareNumber does not work correctly for number " + a + ".");
        }
    }
}