package com.kodilla.collections.adv.maps.homework;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolTestSuite {

    @Test
    void shouldCountTotalPupils() {
        //Given
        School school = new School(Arrays.asList(23, 23, 24, 25, 21, 19, 19, 18), "Technikum Nr 1 w Lesznie");
        //When
        int totalPupilsCount = school.countTotalPupils();
        //Then
        assertEquals(172, totalPupilsCount);
    }
}