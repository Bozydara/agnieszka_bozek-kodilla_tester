package com.kodilla;

import java.util.Scanner;

public class UserInteraction {

    public static String getFirstLetterOfColour() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide first letter of any colour:");
        String letter = scanner.nextLine().trim().toUpperCase();
        return letter;
    }
}