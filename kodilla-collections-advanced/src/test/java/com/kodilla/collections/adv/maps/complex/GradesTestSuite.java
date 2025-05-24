package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GradesTestSuite {

    @Test
    void shouldCountGradesAverage() {
        //Given
        Grades grades = new Grades(Arrays.asList(5.0, 4.0, 4.5, 5.0, 5.0));
        //When
        double actualAverage = grades.getAverage();
        //Then
        assertEquals(4.7, actualAverage);
    }
}