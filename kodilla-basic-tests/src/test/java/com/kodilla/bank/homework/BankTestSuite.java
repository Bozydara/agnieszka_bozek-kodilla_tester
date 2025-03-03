package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    Bank bank = new Bank();
    CashMachine cashMachine1 = new CashMachine();
    CashMachine cashMachine2 = new CashMachine();
    CashMachine cashMachine3 = new CashMachine();
    CashMachine cashMachine4 = new CashMachine();
    CashMachine cashMachine5 = new CashMachine();

    @Test
    public void shouldAddCashMachinesToThePool() {

        bank.addCashMachinesToTheTable(cashMachine1);
        bank.addCashMachinesToTheTable(cashMachine2);
        bank.addCashMachinesToTheTable(cashMachine3);
        bank.addCashMachinesToTheTable(cashMachine4);
        bank.addCashMachinesToTheTable(cashMachine5);

        assertEquals(5, bank.getCashMachinesAmount());
    }

    @Test
    public void shouldSumAllTransactionsFromAllCashMachines() {

        cashMachine1.registerTransaction(45.50);
        cashMachine1.registerTransaction(-315.00);
        cashMachine1.registerTransaction(-24.99);
        cashMachine2.registerTransaction(20);
        cashMachine3.registerTransaction(-7500);
        cashMachine4.registerTransaction(1500);
        cashMachine4.registerTransaction(0);
        cashMachine5.registerTransaction(18);

        bank.addCashMachinesToTheTable(cashMachine1);
        bank.addCashMachinesToTheTable(cashMachine2);
        bank.addCashMachinesToTheTable(cashMachine3);
        bank.addCashMachinesToTheTable(cashMachine4);
        bank.addCashMachinesToTheTable(cashMachine5);

        assertEquals(-6256.49, bank.getTotalBalance());
    }

    @Test
    public void shouldCountAllDepositsFromAllCashMachines() {

        cashMachine1.registerTransaction(0);
        cashMachine1.registerTransaction(-315.00);
        cashMachine1.registerTransaction(-1);
        cashMachine1.registerTransaction(100000);
        cashMachine1.registerTransaction(-24.99);
        cashMachine2.registerTransaction(20);
        cashMachine3.registerTransaction(0);
        cashMachine3.registerTransaction(6549);
        cashMachine3.registerTransaction(0);
        cashMachine3.registerTransaction(350);
        cashMachine3.registerTransaction(-7500);
        cashMachine4.registerTransaction(1500);
        cashMachine4.registerTransaction(0);
        cashMachine4.registerTransaction(-90);
        cashMachine4.registerTransaction(0);
        cashMachine4.registerTransaction(10);
        cashMachine4.registerTransaction(0);
        cashMachine5.registerTransaction(18);

        bank.addCashMachinesToTheTable(cashMachine1);
        bank.addCashMachinesToTheTable(cashMachine2);
        bank.addCashMachinesToTheTable(cashMachine3);
        bank.addCashMachinesToTheTable(cashMachine4);
        bank.addCashMachinesToTheTable(cashMachine5);

        assertEquals(7, bank.getTotalDepositsCount());
    }

    @Test
    public void shouldCountAllWithdrawalsFromAllCashMachines() {

        cashMachine1.registerTransaction(-45.50);
        cashMachine1.registerTransaction(20);
        cashMachine2.registerTransaction(-7500);
        cashMachine2.registerTransaction(1500);
        cashMachine3.registerTransaction(-34);
        cashMachine4.registerTransaction(10);
        cashMachine4.registerTransaction(0);
        cashMachine5.registerTransaction(0);

        bank.addCashMachinesToTheTable(cashMachine1);
        bank.addCashMachinesToTheTable(cashMachine2);
        bank.addCashMachinesToTheTable(cashMachine3);
        bank.addCashMachinesToTheTable(cashMachine4);
        bank.addCashMachinesToTheTable(cashMachine5);

        assertEquals(3, bank.getTotalWithdrawalsCount());
    }

    @Test
    public void shouldCalculateAverageDepositAmountFromAllCashMachines() {

        cashMachine1.registerTransaction(0);
        cashMachine1.registerTransaction(-315.00);
        cashMachine1.registerTransaction(-1);
        cashMachine1.registerTransaction(100000);
        cashMachine1.registerTransaction(-24.99);
        cashMachine2.registerTransaction(20);
        cashMachine3.registerTransaction(0);
        cashMachine3.registerTransaction(6549);
        cashMachine3.registerTransaction(0);
        cashMachine3.registerTransaction(350);
        cashMachine3.registerTransaction(-7500);
        cashMachine4.registerTransaction(1500);
        cashMachine4.registerTransaction(0);
        cashMachine4.registerTransaction(-90);
        cashMachine4.registerTransaction(0);
        cashMachine4.registerTransaction(10);
        cashMachine4.registerTransaction(0);
        cashMachine5.registerTransaction(18);

        bank.addCashMachinesToTheTable(cashMachine1);
        bank.addCashMachinesToTheTable(cashMachine2);
        bank.addCashMachinesToTheTable(cashMachine3);
        bank.addCashMachinesToTheTable(cashMachine4);
        bank.addCashMachinesToTheTable(cashMachine5);

        assertEquals(15492.42, bank.getAverageDepositAmount(), 0.01);
    }

    @Test
    public void shouldCalculateAverageWithdrawalAmountFromAllCashMachines() {

        cashMachine1.registerTransaction(0);
        cashMachine1.registerTransaction(-315.00);
        cashMachine1.registerTransaction(-1);
        cashMachine1.registerTransaction(100000);
        cashMachine1.registerTransaction(-24.99);
        cashMachine2.registerTransaction(20);
        cashMachine3.registerTransaction(0);
        cashMachine3.registerTransaction(6549);
        cashMachine3.registerTransaction(0);
        cashMachine3.registerTransaction(350);
        cashMachine3.registerTransaction(-7500);
        cashMachine4.registerTransaction(1500);
        cashMachine4.registerTransaction(0);
        cashMachine4.registerTransaction(-90);
        cashMachine4.registerTransaction(0);
        cashMachine4.registerTransaction(10);
        cashMachine4.registerTransaction(0);
        cashMachine5.registerTransaction(18);

        bank.addCashMachinesToTheTable(cashMachine1);
        bank.addCashMachinesToTheTable(cashMachine2);
        bank.addCashMachinesToTheTable(cashMachine3);
        bank.addCashMachinesToTheTable(cashMachine4);
        bank.addCashMachinesToTheTable(cashMachine5);

        assertEquals(-1586.19, bank.getAverageWithdrawalAmount(), 0.01);
    }
}