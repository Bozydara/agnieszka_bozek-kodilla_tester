package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("Colorado", 2.5, 1.4, false));
        stamps.add(new Stamp("Paris", 2, 1, true));
        stamps.add(new Stamp("London", 3, 2, false));
        stamps.add(new Stamp("Cracow", 1.5, 2.1, true));
        stamps.add(new Stamp("Munich", 3, 1, false));
        stamps.add(new Stamp("Colorado", 2.5, 1.4, false));
        stamps.add(new Stamp("Paris", 2.1, 1, true));
        stamps.add(new Stamp("London", 3, 2, true));
        stamps.add(new Stamp("Cracow", 1.5, 2.1, true));
        stamps.add(new Stamp("Muenchen", 3, 1, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}