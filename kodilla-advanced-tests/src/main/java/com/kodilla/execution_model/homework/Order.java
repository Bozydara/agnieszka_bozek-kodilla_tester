package com.kodilla.execution_model.homework;

public class Order {
    double price;
    int date;
    String login;

    public Order(double price, int date, String login) {
        this.price = price;
        this.date = date;
        this.login = login;
    }

    public int getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public String getLogin() {
        return login;
    }
}