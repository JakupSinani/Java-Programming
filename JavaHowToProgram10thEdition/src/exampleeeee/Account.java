package exampleeeee;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private static int nextId = 1;
    private int id;
    private String name;
    private double balance;
    private List<Transaction> transactions;

    public Account(String name, double balance) {
        this.id = nextId++;
        this.name = name;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - amount < 0) {
            throw new InsufficientFundsException();
        }
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public int getAccountId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}

