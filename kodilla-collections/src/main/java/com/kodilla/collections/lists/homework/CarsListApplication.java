package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volkswagen;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Toyota toyotaCar = new Toyota(75);

        cars.add(new Audi(45));
        cars.add(new Audi(145));
        cars.add(new Audi(125));
        cars.add(new Volkswagen(80));
        cars.add(new Volkswagen(85));
        cars.add(toyotaCar);

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(4);
        cars.remove(toyotaCar);

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println("-----------------------------");
        System.out.println("Cars collection contains " + cars.size() + " cars.");
    }
}