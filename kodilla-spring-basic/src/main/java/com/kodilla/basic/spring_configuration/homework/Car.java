package com.kodilla.basic.spring_configuration.homework;

import java.time.LocalTime;
import java.util.Random;

public interface Car {

    default boolean hasHeadlightsTurnedOn() {

        Random generator = new Random();
        int hour = generator.nextInt(24);
        int minute = generator.nextInt(61);

        LocalTime randomTime = LocalTime.of(hour, minute);

        if (randomTime.equals(LocalTime.of(06, 00)) || randomTime.isAfter(LocalTime.of(06, 00))
                && randomTime.isBefore(LocalTime.of(20, 00))) {
            {
                return false;
            }
        } else {
            return true;
        }
    }

    String getCarType();
}