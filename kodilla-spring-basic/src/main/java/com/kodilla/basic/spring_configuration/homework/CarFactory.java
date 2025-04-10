package com.kodilla.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.Random;

@Configuration
public class CarFactory {

    @Bean
    public Car getCarTypeAccordingToTheSeasonAndCheckLights() {
        Car car;
        boolean areLightsOn;
        Random generator = new Random();
        int season = generator.nextInt(4);

        if (season == 0 || season == 1) {
            car = new Sedan();
        } else if (season == 2) {
            car = new Cabrio();
        } else car = new Suv();

        int hour = generator.nextInt(24);
        int minute = generator.nextInt(61);

        LocalTime randomTime = LocalTime.of(hour, minute);

        if (randomTime.equals(LocalTime.of(06, 00)) || randomTime.isAfter(LocalTime.of(06, 00))
                && randomTime.isBefore(LocalTime.of(20, 00))) {
            {
                areLightsOn = !car.hasHeadlightsTurnedOn();
                System.out.println("Are the lights on?: " + areLightsOn);
            }
        } else {
            areLightsOn = car.hasHeadlightsTurnedOn();
            System.out.println("Are the lights on?: " + areLightsOn);
        }
        return car;
    }
}