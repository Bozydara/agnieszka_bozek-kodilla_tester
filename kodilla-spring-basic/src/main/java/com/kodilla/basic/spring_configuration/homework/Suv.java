package com.kodilla.basic.spring_configuration.homework;

public class Suv implements Car{
    @Override
    public boolean hasHeadlightsTurnedOn() {
        return true;
    }

    @Override
    public String getCarType() {
        return "Suv";
    }
}