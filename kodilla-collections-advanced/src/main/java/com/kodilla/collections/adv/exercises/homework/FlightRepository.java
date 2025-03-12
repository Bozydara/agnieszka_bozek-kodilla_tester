package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();

        flights.add(new Flight("KRK", "CDG"));
        flights.add(new Flight("KRK", "LON"));
        flights.add(new Flight("KRK", "FRA"));
        flights.add(new Flight("KRK", "WAW"));
        flights.add(new Flight("KRK", "TLV"));
        flights.add(new Flight("LON", "KRK"));
        flights.add(new Flight("LON", "MAD"));
        flights.add(new Flight("LON", "CDG"));
        flights.add(new Flight("LON", "MUC"));
        flights.add(new Flight("LON", "FRA"));
        flights.add(new Flight("FRA", "LON"));
        flights.add(new Flight("FRA", "MUC"));
        flights.add(new Flight("FRA", "KRK"));
        flights.add(new Flight("FRA", "PMI"));
        flights.add(new Flight("DFW", "MIA"));
        flights.add(new Flight("DFW", "ORD"));
        flights.add(new Flight("DFW", "WAW"));
        flights.add(new Flight("MIA", "DFW"));
        flights.add(new Flight("MIA", "KRK"));
        flights.add(new Flight("MIA", "FRA"));

        return flights;
    }
}