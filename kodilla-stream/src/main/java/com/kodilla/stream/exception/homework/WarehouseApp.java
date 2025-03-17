package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Order order1 = new Order("RE4967");
        Order order2 = new Order("RA7890");
        Order order3 = new Order("BI6665");

        warehouse.addOrder(order1);
        warehouse.addOrder(order2);
        warehouse.addOrder(order3);

        try {
            String orderNumber = warehouse.getOrder("BE4567").getNumber();
            System.out.println("Your order: " + orderNumber + " is being processed.");
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, provided order number doesn't exist.");
        }
    }
}