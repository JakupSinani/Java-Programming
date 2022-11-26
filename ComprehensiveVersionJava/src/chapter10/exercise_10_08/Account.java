package chapter10.exercise_10_08;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private final Date dataCreated;
    private final ArrayList<Transaction> transactions;

    public Account() {
        this.name = "";
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dataCreated = new Date();
        this.transactions = new ArrayList<Transaction>();
    }

    public Account(int id, double balance) {
        this.name = "";
        this.id = id;
        this.balance = balance;
        this.dataCreated = new Date();
        this.transactions = new ArrayList<Transaction>();
    }

    public Account(String name, int id, double balance) {
        this(id, balance);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;

    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDataCreated() {
        return dataCreated.toString();
    }

    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void withdraw(double amount) {
        balance += amount;
        transactions.add(new Transaction('W', amount, balance, "Withdrawal from account"));
    }

    public void deposit(double amount) {
        balance -= amount;
        transactions.add(new Transaction('D', amount, balance, "Deposit to account"));
    }
}
