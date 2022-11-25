package BANKSYSTEM;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<Account>();
    private double totalTransactionFeeAmount = 0;
    private double totalTransferAmount = 0;
    private double transactionFlatFeeAmount = 0;
    private double transactionPercentFeeValue = 0;

    public Bank() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public double getTotalTransactionFeeAmount() {
        return totalTransactionFeeAmount;
    }

    public void setTotalTransactionFeeAmount(double totalTransactionFeeAmount) {
        this.totalTransactionFeeAmount = totalTransactionFeeAmount;
    }

    public double getTotalTransferAmount() {
        return totalTransferAmount;
    }

    public void setTotalTransferAmount(double totalTransferAmount) {
        this.totalTransferAmount = totalTransferAmount;
    }

    public double getTransactionFlatFeeAmount() {
        return transactionFlatFeeAmount;
    }

    public void setTransactionFlatFeeAmount(double transactionFlatFeeAmount) {
        this.transactionFlatFeeAmount = transactionFlatFeeAmount;
    }

    public double getTransactionPercentFeeValue() {
        return transactionPercentFeeValue;
    }

    public void setTransactionPercentFeeValue(double transactionPercentFeeValue) {
        this.transactionPercentFeeValue = transactionPercentFeeValue;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void deposit(double amount, double fee, Account accountttt, String reason) {
        double percentFee = (amount * fee) / 100;
        double newBalance = accountttt.getBalance() + amount - percentFee;
        accountttt.setBalance(newBalance);
        double totalFeeAmount = getTotalTransactionFeeAmount() + percentFee;
        setTotalTransactionFeeAmount(totalFeeAmount);
        setTransactionPercentFeeValue(percentFee);
        Transaction transaction = new Transaction();
        transaction.setAmount(amount);
        transaction.setTransactionReason(reason);
        accountttt.addTransaction(transaction);
    }

    public void withdraw(double amount, double fee, Account accountttt, String reason) {
        double newBalance = accountttt.getBalance() - amount - fee;
        accountttt.setBalance(newBalance);
        double totalFeeAmount = getTotalTransactionFeeAmount() + fee;
        setTotalTransactionFeeAmount(totalFeeAmount);
        setTransactionFlatFeeAmount(fee);
        Transaction transaction = new Transaction();
        transaction.setAmount(amount);
        transaction.setTransactionReason(reason);
        accountttt.addTransaction(transaction);
    }

    public void transfer(Account from, Account to, double amount, double fee) {
        if (from.getBalance() < 0) {
            System.out.println("insuficient");
        } else {
            withdraw(amount, fee, from, "pagimi i borxhit");
            //from.addTransaction(withdraw(amount,fee,from,reason););
            deposit(amount, fee, to, "pranimi i parave borxh");
            setTotalTransferAmount(amount + getTotalTransferAmount());
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                ", totalTransactionFeeAmount=" + totalTransactionFeeAmount +
                ", totalTransferAmount=" + totalTransferAmount +
                ", transactionFlatFeeAmount=" + transactionFlatFeeAmount +
                ", transactionPercentFeeValue=" + transactionPercentFeeValue +
                '}';
    }
}