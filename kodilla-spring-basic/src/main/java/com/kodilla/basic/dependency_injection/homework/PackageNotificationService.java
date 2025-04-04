package com.kodilla.basic.dependency_injection.homework;

public class PackageNotificationService implements NotificationService {

    public void success(String address) {
        System.out.println("Package delivered to: " + address);
    }

    public void fail(String address) {
        System.out.println("Package not delivered to: " + address);
    }
}