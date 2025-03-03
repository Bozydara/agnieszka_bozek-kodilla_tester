package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldRegisterAllTransactions() {

        cashMachine.registerTransaction(-45.50);
        cashMachine.registerTransaction(20);
        cashMachine.registerTransaction(-7500);
        cashMachine.registerTransaction(1500);
        cashMachine.registerTransaction(0);


        double[] transactions = cashMachine.getTransactions();
        assertEquals(5, transactions.length);
        assertEquals(-45.50, transactions[0]);
        assertEquals(20, transactions[1]);
        assertEquals(-7500, transactions[2]);
        assertEquals(1500, transactions[3]);
        assertEquals(0, transactions[4]);

    }

    @Test
    public void shouldSumAllTransactions() {

        cashMachine.registerTransaction(-45.50);
        cashMachine.registerTransaction(20);
        cashMachine.registerTransaction(-7500);
        cashMachine.registerTransaction(1500);
        cashMachine.registerTransaction(0);

        assertEquals(-6025.50, cashMachine.getBalance(), 0.01);
    }

    @Test
    public void shouldCountAllTransactions() {

        cashMachine.registerTransaction(-45.50);
        cashMachine.registerTransaction(20);
        cashMachine.registerTransaction(-7500);
        cashMachine.registerTransaction(1500);
        cashMachine.registerTransaction(0);

        assertEquals(5, cashMachine.getTransactionsCount());
    }

    @Test
    public void shouldCountAllDeposits() {

        cashMachine.registerTransaction(-45.50);
        cashMachine.registerTransaction(20);
        cashMachine.registerTransaction(-7500);
        cashMachine.registerTransaction(1500);
        cashMachine.registerTransaction(0);

        assertEquals(2, cashMachine.getDepositsCount());
    }

    @Test
    public void shouldCountAllWithdrawals() {

        cashMachine.registerTransaction(-45.50);
        cashMachine.registerTransaction(20);
        cashMachine.registerTransaction(-7500);
        cashMachine.registerTransaction(1500);
        cashMachine.registerTransaction(0);

        assertEquals(2, cashMachine.getWithdrawalsCount());
    }

    @Test
    public void shouldSumAllDeposits() {

        cashMachine.registerTransaction(-45.50);
        cashMachine.registerTransaction(20);
        cashMachine.registerTransaction(-7500);
        cashMachine.registerTransaction(1500);
        cashMachine.registerTransaction(0);

        assertEquals(1520, cashMachine.getDepositsSum());
    }

    @Test
    public void shouldSumAllWithdrawals() {

        cashMachine.registerTransaction(-45.50);
        cashMachine.registerTransaction(20);
        cashMachine.registerTransaction(-7500);
        cashMachine.registerTransaction(1500);
        cashMachine.registerTransaction(0);

        assertEquals(-7545.50, cashMachine.getWithdrawalsSum());
    }
}