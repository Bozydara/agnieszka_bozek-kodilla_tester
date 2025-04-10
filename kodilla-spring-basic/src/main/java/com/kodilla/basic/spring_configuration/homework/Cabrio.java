package com.kodilla.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car {
    @Override
    public boolean hasHeadlightsTurnedOn() {
        return true;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}