package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    double price;
    LocalDate date;
    String login;

    public Order(double price, int year, int month, int day, String login) {
        this.price = price;
        this.date = LocalDate.of(year, month, day);
        this.login = login;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public String getLogin() {
        return login;
    }
}