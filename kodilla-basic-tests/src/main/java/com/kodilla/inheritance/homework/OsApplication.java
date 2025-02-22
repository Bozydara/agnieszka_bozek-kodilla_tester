package com.kodilla.inheritance.homework;

public class OsApplication {
    public static void main(String[] args) {

        WindowsOs windowsOs = new WindowsOs(2022);
        MacOs macOs = new MacOs(2019);

        windowsOs.turnOn();
        windowsOs.turnOff();
        macOs.turnOn();
        macOs.turnOff();
    }
}