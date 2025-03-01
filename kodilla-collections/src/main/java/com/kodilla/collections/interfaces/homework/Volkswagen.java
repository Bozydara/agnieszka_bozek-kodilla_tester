package com.kodilla.collections.interfaces.homework;

public class Volkswagen implements Car {
    private int speed;

    public Volkswagen(int speed) {

        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 50;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 15;
    }
}