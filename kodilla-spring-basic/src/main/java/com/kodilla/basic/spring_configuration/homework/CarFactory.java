package com.kodilla.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CarFactory {

    @Bean
    public Car getCarTypeAccordingToTheSeasonAndCheckLights() {
        Car car;

        String season = calculateSeason();

        if (season.equals("summer")) {
            car = new Cabrio();
        } else if (season.equals("winter")) {
            car = new Suv();
        } else {
            car = new Sedan();
        }

        System.out.println("Are the lights on?: " + car.hasHeadlightsTurnedOn());

        return car;
    }

    private String calculateSeason() {

        Random generator = new Random();
        int month = generator.nextInt(12) + 1;
        int day = switch (month) {
            case 2 -> generator.nextInt(29) + 1;
            case 4, 6, 9, 11 -> generator.nextInt(30) + 1;
            default -> generator.nextInt(31) + 1;
        };

        if (month == 12 && day >= 22 || month <= 3 && day <= 20) {
            return "winter";
        } else if (month == 3 && day >= 21 || month <= 6 && day <= 21) {
            return "spring";
        } else if (month == 6 && day >= 22 || month <= 9 && day <= 22) {
            return "summer";
        } else {
            return "autumn";
        }
    }
}