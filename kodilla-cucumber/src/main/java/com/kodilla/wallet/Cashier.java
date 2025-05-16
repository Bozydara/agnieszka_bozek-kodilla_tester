package com.kodilla.wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        wallet.debit(amount);

        if (amount > wallet.getBalance()) {
            getNotEnoughMoneyMessage();
        } else {
            cashSlot.dispense(amount);
        }
    }

    private String getNotEnoughMoneyMessage() {
        return "You don't have enough money in your wallet!";

    }
}