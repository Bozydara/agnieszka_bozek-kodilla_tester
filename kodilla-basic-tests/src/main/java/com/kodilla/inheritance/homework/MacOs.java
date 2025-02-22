package com.kodilla.inheritance.homework;

public class MacOs extends OperatingSystem {
    public MacOs(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Mac OS from " + getReleaseYear() + " is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Mac OS from " + getReleaseYear() + " is off.");
    }
}