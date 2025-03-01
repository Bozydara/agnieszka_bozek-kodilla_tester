package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volkswagen;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarBrand = random.nextInt(3);
        if (drawnCarBrand == 0)
            return new Toyota(getRandomSpeed());
        else if (drawnCarBrand == 1)
            return new Volkswagen(getRandomSpeed());
        else
            return new Audi(getRandomSpeed());
    }

    private static int getRandomSpeed() {
        Random random = new Random();
        int randomSpeed = random.nextInt(50 + 1);
        return randomSpeed;
    }
}