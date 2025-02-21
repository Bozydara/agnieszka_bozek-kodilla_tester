package com.kodilla;

import java.util.Random;

public class RandomNumbers {


    public static void sumRandomNumbers() {
        Random random = new Random();
        int sum = 0;
        while (sum < 5000) {
            int randomNumber = random.nextInt(31);
            sum = sum + randomNumber;
        }
    }

    public static int getTheLowestRandomNumber() {
        Random random = new Random();
        int sum = 0;
        int previousRandomNumber = 0;
        int theLowestNumber = 0;
        while (sum < 5000) {
            int randomNumber = random.nextInt(31);
            sum = sum + randomNumber;
            if (randomNumber < previousRandomNumber || previousRandomNumber == 0) {
                if (randomNumber < theLowestNumber || theLowestNumber == 0) {
                    theLowestNumber = randomNumber;
                    if (theLowestNumber == 0) {
                        return theLowestNumber;
                    }
                }
            }
            previousRandomNumber = 0 + randomNumber;
        }
        return theLowestNumber;
    }

    public static int getTheHighestRandomNumber() {
        Random random = new Random();
        int sum = 0;
        int theHighestNumber = 0;
        int previousRandomNumber = 0;
        while (sum < 5000) {
            int randomNumber = random.nextInt(31);
            sum = sum + randomNumber;

            if (randomNumber > previousRandomNumber) {
                if (randomNumber > theHighestNumber) {
                    theHighestNumber = randomNumber;
                }
                if (theHighestNumber == 30) {
                    return theHighestNumber;
                }
            }
            previousRandomNumber = 0 + randomNumber;
        }
        return theHighestNumber;
    }
}