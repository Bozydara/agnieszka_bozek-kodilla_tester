package com.kodilla.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {

        DeliveryService deliveryService = new PackageDeliveryService();
        NotificationService notificationService = new PackageNotificationService();

        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        shippingCenter.send("Hill Street 11, New York", 18.2);
    }
}