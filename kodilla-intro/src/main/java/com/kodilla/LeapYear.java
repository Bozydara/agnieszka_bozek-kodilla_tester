package com.kodilla;

public class LeapYear {
    public static void main(String[] args) {
        int year = 1700;

        if (isLeapYear(year)) {
            System.out.println("This is a leap year!");
        } else {
            System.out.println("This is not a leap year!");
        }
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return true;
        } else return year % 4 == 0 && year % 100 != 0;
    }
}