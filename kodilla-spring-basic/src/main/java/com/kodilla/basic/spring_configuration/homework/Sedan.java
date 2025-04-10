package com.kodilla.basic.spring_configuration.homework;

public class Sedan implements Car {
    @Override
    public boolean hasHeadlightsTurnedOn() {
        return true;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}