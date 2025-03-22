package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> providePersonObjectsForTestingBmi() {
        return Stream.of(
                Arguments.of(new Person(1.60, 67), "Overweight" ),
                Arguments.of(new Person(1.90, 55),"Severely underweight"),
                Arguments.of(new Person(1.70, 120),"Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.50, 40),"Underweight"),
                Arguments.of(new Person(1.75, 140),"Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(2.15, 100),"Normal (healthy weight)"),
                Arguments.of(new Person(1.56, 42),"Underweight")
        );
    }
}