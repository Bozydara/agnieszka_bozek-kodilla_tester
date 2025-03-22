package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionWhenInvalidNumbersProvided(int number1, int number2, int number3, int number4, int number5, int number6) {
        Set<Integer> inputs = new HashSet<>();
        inputs.add(number1);
        inputs.add(number2);
        inputs.add(number3);
        inputs.add(number4);
        inputs.add(number5);
        inputs.add(number6);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(inputs));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbersSize.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionWhenIncorrectNumbersSizeProvided(int number1, int number2, int number3, int number4, int number5) {
        Set<Integer> inputs = new HashSet<>();
        inputs.add(number1);
        inputs.add(number2);
        inputs.add(number3);
        inputs.add(number4);
        inputs.add(number5);

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(inputs));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/validNumbersAndSize.csv", numLinesToSkip = 1)
    public void shouldCountWins(int number1, int number2, int number3, int number4, int number5, int number6) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        numbers.add(number6);

        Set<Integer> counts = Set.of(0, 1, 2, 3, 4, 5, 6);

        assertTrue(counts.contains(gamblingMachine.howManyWins(numbers)));
    }
}