package com.kodilla.stream.exception.homework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Warehouse {

    Set<Order> ordersList = new HashSet<>();

    public void addOrder(Order order) {
        ordersList.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        List<Order> orders = ordersList
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .toList();

        if (orders.size() == 1) {
            return orders.getFirst();
        } else throw new OrderDoesntExistException();
    }
}