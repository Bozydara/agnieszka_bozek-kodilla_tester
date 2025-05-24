package com.kodilla.spring.basic.dependency_injection.homework;

import com.kodilla.basic.dependency_injection.homework.PackageDeliveryService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PackageDeliveryServiceTestSuite {

    PackageDeliveryService packageDeliveryService = new PackageDeliveryService();

    @ParameterizedTest
    @ValueSource(doubles = {14.5, 29, 30})
    void shouldReturnTrueIfWeight30OrLess(double weight) {
        //Given
        //When
        boolean result = packageDeliveryService.deliver("Wadowicka 3, Krakow", weight);
        //Then
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(doubles = {30.1, 42, 56})
    void shouldReturnFalseIfWeightMoreThan30(double weight) {
        //Given
        //When
        boolean result = packageDeliveryService.deliver("Reymonta 7, Szczecin", weight);
        //Then
        assertFalse(result);
    }
}