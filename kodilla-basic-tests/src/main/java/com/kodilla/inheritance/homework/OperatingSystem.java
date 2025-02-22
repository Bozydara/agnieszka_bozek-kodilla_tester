package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int releaseYear;


    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void turnOn() {
        System.out.println("Operating system is on.");
    }

    public void turnOff() {
        System.out.println("Operating system is off.");
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}