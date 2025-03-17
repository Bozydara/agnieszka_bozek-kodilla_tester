package com.kodilla.stream.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    void shouldReturnExistingOrder() throws OrderDoesntExistException {

        //given
        Warehouse warehouse = new Warehouse();
        //when
        warehouse.addOrder(new Order("XYF45JFKR"));
        warehouse.addOrder(new Order("ABF85HTFK"));
        warehouse.addOrder(new Order("TRU22OPWD"));
        //then
        assertEquals("ABF85HTFK", warehouse.getOrder("ABF85HTFK").getNumber());
    }

    @Test
    void shouldThrowExceptionWhenOrderDoesntExist() {

        //given
        Warehouse warehouse = new Warehouse();
        //when
        warehouse.addOrder(new Order("XYF45JFKR"));
        warehouse.addOrder(new Order("ABF85HTFK"));
        warehouse.addOrder(new Order("TRU22OPWD"));
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("TRU82OPWD"));
    }
}