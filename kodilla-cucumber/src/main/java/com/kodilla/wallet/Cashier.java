package com.kodilla.wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public String withdraw(Wallet wallet, int amount) {
        wallet.debit(amount);

        if (amount > wallet.getBalance()) {
          return "You don't have enough money in your wallet!";
        } else {
            cashSlot.dispense(amount);
            return "Money dispensed";
        }
    }
}