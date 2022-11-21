package System;

import java.util.ArrayList;

public class Account {
    private int accountId;
    private String name;
    private double balance;
    private ArrayList<Transaction> transactionArrayList = new ArrayList<>();
    private Bank bank;

    public Account() {
    }

    public Account(int accountId, String name, double balance, ArrayList<Transaction> transactionArrayList) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
        this.transactionArrayList = transactionArrayList;
    }

    public Account(int accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransactionArrayList() {
        return transactionArrayList;
    }

    public void setTransactionArrayList(ArrayList<Transaction> transactionArrayList) {
        this.transactionArrayList = transactionArrayList;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void deposit(double amount, String reason) {
        this.balance += amount;
        Transaction transaction = new Transaction();
        transaction.setAmount(amount);
        transaction.setTransactionReason(reason);
        transactionArrayList.add(transaction);
    }

    public void withdraw(double amount, String reason) {
        this.balance -= amount;
        Transaction transaction = new Transaction();
        transaction.setAmount(amount);
        transaction.setTransactionReason(reason);
        transactionArrayList.add(transaction);
    }

    public void transfer(Account from, Account to, double amount, String reason) {
        from.withdraw(amount, reason);
        to.deposit(amount, reason);
        bank.setTotalTransferAmount(amount);
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", transactionArrayList=" + transactionArrayList +
                "}\n";
    }
}
