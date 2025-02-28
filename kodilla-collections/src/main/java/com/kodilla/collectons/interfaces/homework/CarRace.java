package com.kodilla.collectons.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Toyota toyota = new Toyota(80);
        Volkswagen volkswagen = new Volkswagen(60);
        Audi audi = new Audi(100);

        doRace(toyota);
        doRace(volkswagen);
        doRace(audi);
    }

    private static void doRace(Car car) {
        int counter = 0;
        while (counter < 3) {
            car.increaseSpeed();
            counter++;
        }
        counter = 0;
        while (counter < 2) {
            car.decreaseSpeed();
            counter++;
        }
        System.out.println("The final speed is as follows: " + car.getSpeed());
    }
}