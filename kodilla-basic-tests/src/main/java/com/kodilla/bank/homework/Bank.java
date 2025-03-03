package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;
    private int size;

    public Bank() {
        this.size = 0;
        this.cashMachines = new CashMachine[0];
    }

    public void addCashMachinesToTheTable(CashMachine cashMachine) {
        this.size++;
        CashMachine[] tableWithCashMachines = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, tableWithCashMachines, 0, cashMachines.length);
        tableWithCashMachines[size - 1] = cashMachine;
        this.cashMachines = tableWithCashMachines;
    }

    public int getCashMachinesAmount() {
        return cashMachines.length;
    }

    public double getTotalBalance() {

        double totalBalance = 0;

        for (int i = 0; i < cashMachines.length; i++) {
            totalBalance += cashMachines[i].getBalance();
        }

        return totalBalance;
    }

    public int getTotalDepositsCount() {
        int depositCount = 0;
        for (int i = 0; i < cashMachines.length; i++) {

            depositCount = depositCount + cashMachines[i].getDepositsCount();
        }
        return depositCount;
    }

    public int getTotalWithdrawalsCount() {
        int withdrawalCount = 0;
        for (int i = 0; i < cashMachines.length; i++) {

            withdrawalCount += cashMachines[i].getWithdrawalsCount();
        }
        return withdrawalCount;
    }

    public double getAverageDepositAmount() {
        double averageDepositAmount;
        double totalDepositsSum = 0;
        int counter = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalDepositsSum += cashMachines[i].getDepositsSum();
            counter += cashMachines[i].getDepositsCount();
        }
        averageDepositAmount = totalDepositsSum / counter;

        return averageDepositAmount;
    }

    public double getAverageWithdrawalAmount() {
        double averageWithdrawalAmount = 0;
        double totalWithdrawalsSum = 0;
        int counter = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalWithdrawalsSum += cashMachines[i].getWithdrawalsSum();
            counter += cashMachines[i].getWithdrawalsCount();
        }
        averageWithdrawalAmount = totalWithdrawalsSum / counter;

        return averageWithdrawalAmount;
    }
}