package com.kodilla.basic.dependency_injection.homework;

public class ShippingCenter {

    private final DeliveryService deliveryService;
    private final NotificationService notificationService;

    public ShippingCenter(
            DeliveryService deliveryService,
            NotificationService notificationService
    ) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public void send(String address, double weight) {
        if (deliveryService.deliver(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}