package com.kodilla.inheritance.homework;

public class WindowsOs extends OperatingSystem {

    public WindowsOs(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Windows OS from " + getReleaseYear() + " is on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows OS from " + getReleaseYear() + " is off.");
    }
}