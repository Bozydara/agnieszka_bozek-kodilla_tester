package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    Shop shop = new Shop();

    Order order1 = new Order(43.28, 2025, 3,28, "fre567");
    Order order2 = new Order(500.01, 2024,12,28, "baw213");
    Order order3 = new Order(415.06, 2025,2,2, "uok567");
    Order order4 = new Order(16.35, 2024,9,12, "itr897");
    Order order5 = new Order(200, 2025,1,28, "ret432");
    Order order6 = new Order(17.68, 2025,2,8, "lou794");
    Order order7 = new Order(25.32, 2025,3,20, "ari999");
    Order order8 = new Order(1.00, 2025,3,4, "aho137");
    Order order9 = new Order(35.50, 2025,3,11, "ver512");

    @BeforeEach
    public void createOrdersList() {

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
        shop.addOrder(order7);
        shop.addOrder(order8);
        shop.addOrder(order9);
    }

    @Test
    public void shouldAddNewOrder() {

        shop.addOrder(new Order(43.28, 2025,03,13, "aki945"));
        assertEquals(10, shop.getSize());
    }

    @Test
    public void shouldReturnOrdersForSpecificDateRange() {

        List<Order> expectedList = new ArrayList<>();
        LocalDate startDate = LocalDate.of(2025,03,04);
        LocalDate endDate = LocalDate.of(2025,03,31);
        List<Order> actualList = shop.getOrdersWithinDateRange(startDate, endDate);

        expectedList.add(order1);
        expectedList.add(order7);
        expectedList.add(order8);
        expectedList.add(order9);

        assertEquals(4, actualList.size());
        assertEquals(getSortedLogins(expectedList), getSortedLogins(actualList));
    }

    @Test
    public void shouldReturnOrdersWithinPriceRange() {

        List<Order> expectedList = new ArrayList<>();
        List<Order> actualList = shop.getOrdersWithinPriceRange(17.69,35.50);

        expectedList.add(order7);
        expectedList.add(order9);

        assertEquals(2, actualList.size());
        assertEquals(getSortedLogins(expectedList), getSortedLogins(actualList));
    }

    @Test
    public void shouldReturnOrdersSize() {

        assertEquals(9, shop.getSize());
    }

    @Test
    public void shouldSumAllOrdersValue() {

        assertEquals(1254.20, shop.sumAllOrdersValue(), 0.2);
    }

    private List<String> getSortedLogins(List<Order> orders) {
        List<String> logins = orders
                .stream()
                .map(Order::getLogin)
                .sorted()
                .collect(Collectors.toList());
        return logins;
    }
}