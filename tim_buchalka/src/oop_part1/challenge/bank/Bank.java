package oop_part1.challenge.bank;

public class Bank {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Bank() {
        this("56789", 2.50, "default name", "default address", "defaul phone");
        System.out.println("Empty constructor called!");
    }

    public Bank(String name, String email, String phoneNumber) {
        this("99999", 100.55, name, email, phoneNumber);
       /* this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;*/
    }

    public Bank(String accountNumber, double balance, String name, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " made. New balance is " + balance);
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed. Remaining balance " + balance);
        } else {
            System.out.println("Only " + balance + " available. Withdrawal processed");
        }
    }
}
