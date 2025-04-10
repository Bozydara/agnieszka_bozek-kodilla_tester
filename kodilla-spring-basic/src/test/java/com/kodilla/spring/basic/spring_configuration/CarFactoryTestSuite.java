package com.kodilla.spring.basic.spring_configuration;

import com.kodilla.basic.spring_configuration.homework.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void shouldReturnCarTypeForParticularSeasonAndCheckIfLightsOn() {
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.basic");
        Car car = (Car) applicationContext.getBean("getCarTypeAccordingToTheSeason");
        //When
        String carType = car.getCarType();
        //Then
        List<String> possibleCarTypes = Arrays.asList("Cabrio", "Sedan", "Suv");
        Assertions.assertTrue(possibleCarTypes.contains(carType));
    }
}