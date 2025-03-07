package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolManagement = new HashMap<>();

        Principal principal1 = new Principal("Jan", "Kowalski");
        Principal principal2 = new Principal("Zbigniew", "Nowak");
        Principal principal3 = new Principal("Joanna", "Frycz");
        Principal principal4 = new Principal("Eliza", "Rumianek");
        Principal principal5 = new Principal("Honorata", "Bobik");
        Principal principal6 = new Principal("Gerwazy", "Sodrech");
        Principal principal7 = new Principal("Kamil", "Kercz");

        School school1 = new School(Arrays.asList(14, 25, 23, 22, 14, 21, 20), "Szkoła Podstawowa im. Adama Mickiewicza w Uzdowie");
        School school2 = new School(Arrays.asList(26, 27, 20, 19), "Szkoła Podstawowa w Pieniężnie");
        School school3 = new School(Arrays.asList(30, 25, 21, 21, 17, 21), "Szkoła Podstawowa nr 3 im. Henryka Sienkiewicza w Chojnicach");
        School school4 = new School(Arrays.asList(30, 22, 21, 20, 17, 20), "Publiczna Szkoła Podstawowa w Pilonie");
        School school5 = new School(Arrays.asList(23, 23, 24, 25, 21, 19, 19, 18), "Technikum Nr 1 w Lesznie");
        School school6 = new School(Arrays.asList(28, 25, 21, 24, 22, 25, 30, 29, 23), "Liceum Ogólnokształcące Nr II im. Leona Kruczkowskiego w Morągu");
        School school7 = new School(Arrays.asList(27, 22, 21, 23, 19, 21, 18), "Branżowa Szkoła Specjalna I stopnia nr 2 w Opocznie");

        schoolManagement.put(principal7, school2);
        schoolManagement.put(principal2, school6);
        schoolManagement.put(principal3, school4);
        schoolManagement.put(principal6, school1);
        schoolManagement.put(principal5, school3);
        schoolManagement.put(principal1, school5);
        schoolManagement.put(principal4, school7);

        for (Map.Entry<Principal, School> principalSchoolEntry : schoolManagement.entrySet()) {
            System.out.println(principalSchoolEntry.getKey().getFirstName() + " " + principalSchoolEntry.getKey().getLastName()
                    + " is a director of " + principalSchoolEntry.getValue().getSchoolName()
                    + " with " + principalSchoolEntry.getValue().countTotalPupils() + " pupils.");
        }
    }
}