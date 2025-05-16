package com.kodilla.wallet;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private int balance = 0;

    public Wallet() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public int getBalance() {
        return balance;
    }

    public void debit(int money) {
        this.balance -= money;
    }

    public String checkCurrency(String currency) {
        List<String> currencies = new ArrayList<>();
        currencies.add("PLN");
        currencies.add("USD");
        currencies.add("EUR");

        if (currencies.contains(currency)) {
            return "This currency is acceptable.";
        } else {
            return "Unfortunately, you cannot deposit money in this currency!";
        }
    }
}