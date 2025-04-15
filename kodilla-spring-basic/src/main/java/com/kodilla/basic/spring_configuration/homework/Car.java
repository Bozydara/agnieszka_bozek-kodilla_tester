package com.kodilla.basic.spring_configuration.homework;

import java.time.LocalTime;

public interface Car {

    default boolean hasHeadlightsTurnedOn() {

        LocalTime localTime = LocalTime.now();

        if (localTime.equals(LocalTime.of(06, 00)) || localTime.isAfter(LocalTime.of(06, 00))
                && localTime.isBefore(LocalTime.of(20, 00))) {
            {
                return false;
            }
        } else {
            return true;
        }
    }

    String getCarType();
}