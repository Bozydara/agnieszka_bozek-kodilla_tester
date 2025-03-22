package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#providePersonObjectsForTestingBmi")
    public void shouldDiagnoseBmiResult(Person person, String expectedBmiDiagnosis) {

        assertEquals(expectedBmiDiagnosis, person.getBMI());
    }
}