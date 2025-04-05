package com.kodilla.basic.dependency_injection.homework;

public class ShippingCenter {

    public void send(DeliveryService deliveryService, NotificationService notificationService) {
        if (deliveryService.deliver()) {
            notificationService.success(deliveryService.getAddress());
        } else {
            notificationService.fail(deliveryService.getAddress());
        }
    }
}