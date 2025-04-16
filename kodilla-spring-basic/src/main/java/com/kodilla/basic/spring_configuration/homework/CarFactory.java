package com.kodilla.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

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

        int currentMonth = LocalDate.now().getMonthValue();
        int currentDay = LocalDate.now().getDayOfMonth();

        if (currentMonth == 12 && currentDay >= 22 || currentMonth <= 3 && currentDay <= 20) {
            return "winter";
        } else if (currentMonth == 3 && currentDay >= 21 || currentMonth <= 6 && currentDay <= 21) {
            return "spring";
        } else if (currentMonth == 6 && currentDay >= 22 || currentMonth <= 9 && currentDay <= 22) {
            return "summer";
        } else {
            return "autumn";
        }
    }
}