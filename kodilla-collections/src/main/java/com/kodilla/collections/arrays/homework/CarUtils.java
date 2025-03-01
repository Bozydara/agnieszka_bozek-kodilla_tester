package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volkswagen;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car brand: " + getCarBrand(car));
        System.out.println("Speed before increase: " + car.getSpeed());
        car.increaseSpeed();
        System.out.println("Speed after increase: " + car.getSpeed());
    }

    private static String getCarBrand(Car car) {
        if (car instanceof Toyota)
            return "Toyota";
        else if (car instanceof Volkswagen)
            return "Volkswagen";
        else if (car instanceof Audi)
            return "Audi";
        else
            return "Unknown car brand";
    }
}