package BANKSYSTEM;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Account jakup = new Account(128130, "Jakup", 1000);
        Account emir = new Account(127840, "Emir", 1000);

        Bank bank = new Bank();
        bank.setName("Stopanska Banka");
        bank.addAccount(emir);
        bank.addAccount(jakup);
        //bank.transfer(jakup,emir,500);
        //bank.deposit(400,15,jakup,"depositim");

        System.out.println("Before deposit: " + jakup.getBalance());
        bank.deposit(400, 15, jakup, "depositim");
        System.out.println("After deposit: " + jakup.getBalance());
        System.out.println("\n");
        System.out.println("Before withdraw: " + jakup.getBalance());
        bank.withdraw(200, 10, jakup, "terheqje");
        System.out.println("After withdraw: " + jakup.getBalance());
        System.out.println("\n");
        System.out.println("Before transfer: " + jakup.getBalance());
        bank.transfer(jakup, emir, 500, 5);
        System.out.println("After Transfer" + jakup.getBalance());

        System.out.println("\n");

        System.out.println("Total transfer amount: " + bank.getTotalTransferAmount());
        System.out.println("Total transaction flat fee amount: " + bank.getTransactionFlatFeeAmount());
        System.out.println("Total transaction percent fee amount: " + bank.getTransactionPercentFeeValue());
        System.out.println("Total transaction fee amount: " + bank.getTotalTransactionFeeAmount());
        System.out.println("Account list: " + bank.getAccounts());

        System.out.println("\n");
        System.out.println("Transaction list of Jakup: " + jakup.getTransactionArrayList());
    }
}
