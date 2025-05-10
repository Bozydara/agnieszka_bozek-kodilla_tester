package com.kodilla.wallet;

public class CashSlot {
    private int contents;

    public int getContents() {
        return contents;
    }

    public void dispense(int amount) {
        this.contents = amount;
    }
}