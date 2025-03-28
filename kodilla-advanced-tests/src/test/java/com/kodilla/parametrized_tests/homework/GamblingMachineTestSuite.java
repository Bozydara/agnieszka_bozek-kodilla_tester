package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionWhenInvalidNumbersProvided(String row) {

        List<String> numbers = Arrays.stream(row.split(";")).toList();
        Set<Integer> inputs = numbers.stream().map(Integer::parseInt).collect(Collectors.toSet());

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(inputs));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbersSize.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionWhenIncorrectNumbersSizeProvided(String row) {

        List<String> numbers = Arrays.stream(row.split(";")).toList();
        Set<Integer> inputs = numbers.stream().map(Integer::parseInt).collect(Collectors.toSet());

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(inputs));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/validNumbersAndSize.csv", numLinesToSkip = 1)
    public void shouldCountWins(String row) throws InvalidNumbersException {

        List<String> numbers = Arrays.stream(row.split(";")).toList();
        Set<Integer> inputs = numbers.stream().map(Integer::parseInt).collect(Collectors.toSet());

        Set<Integer> counts = Set.of(0, 1, 2, 3, 4, 5, 6);

        assertTrue(counts.contains(gamblingMachine.howManyWins(inputs)));
    }
}