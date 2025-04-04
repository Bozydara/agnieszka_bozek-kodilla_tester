package com.kodilla.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {

        DeliveryService deliveryService = new PackageDeliveryService("Hill Street 11, New York", 18.2);
        NotificationService notificationService = new PackageNotificationService();

        ShippingCenter shippingCenter = new ShippingCenter();
        shippingCenter.send(deliveryService, notificationService);
    }
}