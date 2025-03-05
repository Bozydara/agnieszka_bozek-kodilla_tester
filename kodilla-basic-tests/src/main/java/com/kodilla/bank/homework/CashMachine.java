package com.kodilla.bank.homework;

public class CashMachine {

    private double[] transactions;
    private int size;
    private double depositsSum;
    private double withdrawalsSum;
    private int deposits;
    private int withdrawals;

    public CashMachine() {
        this.size = 0;
        this.transactions = new double[0];
    }

    public void registerTransaction(double amount) {

        this.size++;
        double[] newTab = new double[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = amount;
        this.transactions = newTab;
    }

    public double[] getTransactions() {
        return transactions;
    }

    public double getBalance() {
        double balance = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            balance += this.transactions[i];
        }
        return balance;
    }

    public int getTransactionsCount() {
        int transactionsCount = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            transactionsCount++;
        }
        return transactionsCount;
    }

    public int getDepositsCount() {
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                deposits++;
            }
        }
        return deposits;
    }

    public int getWithdrawalsCount() {
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] < 0) {
                withdrawals++;
            }
        }
        return withdrawals;
    }

    public double getDepositsSum() {
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] > 0) {
                depositsSum = depositsSum + transactions[i];
            }
        }
        return depositsSum;
    }

    public double getWithdrawalsSum() {
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] < 0) {
                withdrawalsSum = withdrawalsSum + transactions[i];
            }
        }
        return withdrawalsSum;
    }
}