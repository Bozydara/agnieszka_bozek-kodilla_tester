package com.kodilla.basic.dependency_injection.homework;

public class PackageDeliveryService implements DeliveryService {

    @Override
    public boolean deliver(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
    }
}