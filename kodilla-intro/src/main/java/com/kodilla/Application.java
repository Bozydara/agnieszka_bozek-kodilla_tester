package com.kodilla;

public class Application {
    public static void main(String[] args) {

        ApplicationUser applicationUser = new ApplicationUser("Adam", 40.5, 178);

        applicationUser.checkUserAgeAndHeight();
    }
}