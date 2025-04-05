package com.kodilla.basic.dependency_injection.homework;

public class PackageDeliveryService implements DeliveryService {
    String address;
    double weight;

    public PackageDeliveryService(String address, double weight) {
        this.weight = weight;
        this.address = address;
    }

    @Override
    public boolean deliver() {
        if (weight > 30) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public Double getWeight() {
        return weight;
    }
}