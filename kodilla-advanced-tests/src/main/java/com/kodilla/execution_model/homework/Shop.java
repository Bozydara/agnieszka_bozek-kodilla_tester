package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.*;

public class Shop {

    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrdersWithinPriceRange(double minimalPrice, double maximalPrice) {

        List<Order> ordersInPriceRange = this.orders
                .stream()
                .filter(order -> order.getPrice() >= minimalPrice && order.getPrice() <= maximalPrice)
                .toList();

        return ordersInPriceRange;
    }

    public List<Order> getOrdersWithinDateRange(LocalDate startDate, LocalDate endDate) {

        List<Order> ordersInDateRange = new ArrayList<>();

        for (Order o : orders) {
            LocalDate orderDate = o.getDate();
            if (orderDate.isAfter(startDate) && orderDate.isBefore(endDate) || orderDate.isEqual(startDate)
                    || orderDate.isEqual(endDate)) {
                ordersInDateRange.add(o);
            }
        }
        return ordersInDateRange;
    }

    public double sumAllOrdersValue() {
        double ordersValue = this.orders
                .stream()
                .map(Order::getPrice)
                .mapToDouble(Double::doubleValue).sum();

        return ordersValue;
    }

    public int getSize() {
        return this.orders.size();
    }
}