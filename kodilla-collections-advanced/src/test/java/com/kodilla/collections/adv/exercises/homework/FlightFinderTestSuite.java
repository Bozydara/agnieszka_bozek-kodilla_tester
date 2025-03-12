package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    void findFlightsFrom() {
        //Given
        FlightFinder flightFinder = new FlightFinder();
        //When
        List<Flight> flightsListFromLondon = flightFinder.findFlightsFrom("LON");
        List<Flight> flightsListFromFrankfurt = flightFinder.findFlightsFrom("FRA");
        //Then
        assertEquals(5, flightsListFromLondon.size());
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("LON", "KRK"));
        expectedList.add(new Flight("LON", "MAD"));
        expectedList.add(new Flight("LON", "CDG"));
        expectedList.add(new Flight("LON", "MUC"));
        expectedList.add(new Flight("LON", "FRA"));
        assertEquals(expectedList, flightsListFromLondon);

        assertEquals(4, flightsListFromFrankfurt.size());
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("FRA", "LON"));
        expectedFlights.add(new Flight("FRA", "MUC"));
        expectedFlights.add(new Flight("FRA", "KRK"));
        expectedFlights.add(new Flight("FRA", "PMI"));
        assertEquals(expectedFlights, flightsListFromFrankfurt);
    }

    @Test
    void findFlightsTo() {
        //Given
        FlightFinder flightFinder = new FlightFinder();
        //When
        List<Flight> flightsListToDallas = flightFinder.findFlightsTo("DFW");
        List<Flight> flightsListToCracow = flightFinder.findFlightsTo("KRK");
        //Then
        assertEquals(1, flightsListToDallas.size());
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("MIA", "DFW"));
        assertEquals(expectedList, flightsListToDallas);

        assertEquals(3, flightsListToCracow.size());
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("LON", "KRK"));
        expectedFlights.add(new Flight("FRA", "KRK"));
        expectedFlights.add(new Flight("MIA", "KRK"));
        assertEquals(expectedFlights, flightsListToCracow);
    }
}