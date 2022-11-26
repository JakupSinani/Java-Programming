package chapter08;

import java.util.Date;

public class Exercise_08_07 {
    private int id;
    private double balance;
    private double annualInterestRate;
    private final Date dataCreated;

    public Exercise_08_07() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        dataCreated = new Date();
    }
    //  create an account with the specified id and initial balance

    public Exercise_08_07(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dataCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDataCreated() {
        return dataCreated.toString();
    }// return monthly interest rate

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;

    }// return monthly interest

    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    //  decrease balance by amount
    public void withdraw(double amount) {
        balance -= amount;
    }

    //  increase balance by amount
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "Account "+id+"\nDate created: "+dataCreated+"\nBalance: "+balance+"\nMonthly interest: "+getMonthlyInterest();
    }
}
