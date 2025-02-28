package com.kodilla.collectons.interfaces.homework;

public class Audi implements Car {
    int speed;

    public Audi(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 60;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 17;
    }
}