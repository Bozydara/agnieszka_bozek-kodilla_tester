package com.kodilla.jacoco;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeapYearTest {

    @ParameterizedTest
    @ValueSource(ints = {1600, 1440, 2000})
    void shouldBeLeapYear(int yearValue) {

        //given
        LeapYear year = new LeapYear(yearValue);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @ParameterizedTest
    @ValueSource(ints = {2001, 1500})
    void shouldNotBeLeapYear(int yearValue) {

        //given
        LeapYear year = new LeapYear(yearValue);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertFalse(isLeapYear);
    }
}