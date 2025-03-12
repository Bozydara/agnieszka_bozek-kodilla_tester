package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.getFlightsTable;

public class FlightFinder {

    List<Flight> flightsTable = getFlightsTable();

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightsFromList = new ArrayList<>();

        for (Flight flight : flightsTable) {
            if (flight.getDeparture().equals(departure))
                flightsFromList.add(flight);
        }
        return flightsFromList;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightsToList = new ArrayList<>();

        for (Flight flight : flightsTable) {
            if (flight.getArrival().equals(arrival))
                flightsToList.add(flight);
        }
        return flightsToList;
    }
}