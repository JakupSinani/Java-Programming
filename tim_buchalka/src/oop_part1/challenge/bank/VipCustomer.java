package oop_part1.challenge.bank;

public class VipCustomer {
    private final String name;
    private final String emailAddress;
    private final double creditLimit;

    public VipCustomer() {
        this("Default name", "default@gmail.com", 50000.0);
    }

    public VipCustomer(String name, int creditLimit) {
        this(name, "junfjdsnfkjsadnijfhnbjsbgddfshuo", creditLimit);
    }


    public VipCustomer(String name, String emailAddress, double creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
