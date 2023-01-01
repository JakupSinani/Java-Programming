package exampleeeee;

import java.util.ArrayList;

public class Bank {

    private final String name;

    private final ArrayList<Account> accounts;

    private double totalTransactionFee;

    private double totalTransferAmount;

    private final double transactionFlatFee;

    private final double transactionPercentFee;


    public Bank(String name, double transactionFlatFee, double transactionPercentFee) {

        this.name = name;

        this.accounts = new ArrayList<>();

        this.totalTransactionFee = 0;

        this.totalTransferAmount = 0;

        this.transactionFlatFee = transactionFlatFee;

        this.transactionPercentFee = transactionPercentFee;

    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public Account findAccount(int accountId) {

        for (Account account : this.accounts) {

            if (account.getAccountId() == accountId) {

                return account;

            }

        }

        return null;

    }


    public void transfer(int originAccountId, int resultAccountId, double amount, String reason) throws Exception {
        Account originAccount = findAccount(originAccountId);
        if (originAccount == null) {
            throw new Exception("Origin account not found");
        }
        Account resultAccount = findAccount(resultAccountId);
        if (resultAccount == null) {
            throw new Exception("Result account not found");
        }
        originAccount.withdraw(amount);
        resultAccount.deposit(amount);
        double transactionFee = amount * this.transactionPercentFee + this.transactionFlatFee;
        this.totalTransactionFee += transactionFee;
        this.totalTransferAmount += amount;
        Transaction transaction = new Transaction(Transaction.Type.TRANSFER, originAccountId, resultAccountId, amount, reason);
        originAccount.addTransaction(transaction);
        resultAccount.addTransaction(transaction);
    }


    public void withdraw(int accountId, double amount, String reason) throws Exception {
        Account account = findAccount(accountId);
        if (account == null) {
            throw new Exception("Account not found");
        }
        account.withdraw(amount);
        double transactionFee = amount * this.transactionPercentFee + this.transactionFlatFee;
        this.totalTransactionFee += transactionFee;
        Transaction transaction = new Transaction(Transaction.Type.WITHDRAWAL, accountId, 0, amount, reason);
        account.addTransaction(transaction);
    }

    public void deposit(int accountId, double amount, String reason) throws Exception {
        Account account = findAccount(accountId);
        if (account == null) {
            throw new Exception("Account not found");
        }
        account.deposit(amount);
        double transactionFee = amount * this.transactionPercentFee + this.transactionFlatFee;
        this.totalTransactionFee += transactionFee;
        Transaction transaction = new Transaction(Transaction.Type.DEPOSIT, accountId, 0, amount, reason);
        account.addTransaction(transaction);
    }

    public String getName() {
        return name;
    }

    public void setTotalTransactionFee(double totalTransactionFee) {
        this.totalTransactionFee = totalTransactionFee;
    }

    public void setTotalTransferAmount(double totalTransferAmount) {
        this.totalTransferAmount = totalTransferAmount;
    }

    public double getTransactionFlatFee() {
        return transactionFlatFee;
    }

    public double getTransactionPercentFee() {
        return transactionPercentFee;
    }

    public ArrayList<Account> getAccounts() {

        return this.accounts;

    }


    public double getTotalTransactionFee() {

        return this.totalTransactionFee;

    }


    public double getTotalTransferAmount() {

        return this.totalTransferAmount;
    }
}

